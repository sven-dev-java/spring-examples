package com.example.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class MicroserviceOneController {

	@GetMapping("/hello")
	public String test() {
		return "Hello World - Microservice One";
	}
}
