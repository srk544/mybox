package net.mybox.controller;

import java.sql.SQLException;

import javax.annotation.security.PermitAll;

import net.mybox.dto.Model;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(method = RequestMethod.POST, value = "/create/model")
	Model createModel(@RequestBody Model model) throws SQLException {
		Model addModel = new Model();
		addModel.setMobile(model.getMobile());
		addModel.setVersion(model.getVersion());
		addModel.setStatus(model.getStatus());
		addModel.setFile(model.getFile());
		addModel.setPublishDate(model.getPublishDate());
		return addModel;
	}

}
