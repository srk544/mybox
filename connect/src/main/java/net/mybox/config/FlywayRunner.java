package net.mybox.config;

import java.sql.SQLException;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FlywayRunner {


    private final String jdbcUrl, user, password;

    private static final Logger LOGGER = LoggerFactory.getLogger(FlywayRunner.class);

    @Autowired
    public FlywayRunner(DBConnectionProperties db) {
        this.jdbcUrl = "jdbc:mysql://" + db.host() + ":" + db.port() + "/%s?createDatabaseIfNotExist=true";
        this.user = db.user();
        this.password = db.password();
        migrate();
    }

    public void migrate() {
        migrate("mybox");
    }

    private void migrate(String schema) {
        LOGGER.info("Migrating schema {}", schema);
        Flyway flyway = new Flyway();
        flyway.setLocations("db/migration/" + schema);
        flyway.setDataSource(String.format(jdbcUrl, schema), user, password, "USE " + schema);
        flyway.migrate();
        try {
            flyway.getDataSource().getConnection().close();
        } catch (SQLException e) {
            LOGGER.warn("Failed to close flyway datasource connection", e);
        }
    }
}
