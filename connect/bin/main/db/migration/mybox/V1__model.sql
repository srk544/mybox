CREATE TABLE `mybox`.`model` (
  `ModelNo` VARCHAR(45) NOT NULL,
  `version` VARCHAR(45) NULL,
  `file` VARCHAR(45) NULL,
  `status` CHAR(1) NULL,
  `PublishDate` DATETIME NULL,
  PRIMARY KEY (`ModelNo`));