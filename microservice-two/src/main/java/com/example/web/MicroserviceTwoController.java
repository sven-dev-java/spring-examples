package com.example.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/two")
public class MicroserviceTwoController {

	@GetMapping("/hello")
	public String test() {
		return "Hello World - Microservice Two";
	}
}
