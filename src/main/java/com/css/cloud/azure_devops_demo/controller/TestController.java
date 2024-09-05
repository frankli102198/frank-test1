package com.css.cloud.azure_devops_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/v1/test")
	public Object test() {
		return "Test controller";
	}
}
