package com.example.tracingdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EShopController {

	private static final String template = "You have successfully checked out your shopping cart.";

	@GetMapping("/checkout")
	public String CartString(@RequestParam(value = "name", defaultValue = "") String name) {
		return new String(template);
	}

}