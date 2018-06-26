package net.mybox.controller;

import net.mybox.dto.Model;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {
	
	@RequestMapping(method = RequestMethod.POST, value="/create/model")
	Model createModel(@RequestBody Model model) {
	Model addModel = new Model();
	addModel.setMobile(model.getMobile());
	addModel.setVersion(model.getVersion());
	addModel.setStatus(model.getStatus());
	addModel.setFile(model.getFile());
	addModel.setPublishDate(model.getPublishDate());
	return addModel;
	}

}
