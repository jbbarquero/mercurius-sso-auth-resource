package com.malsolo.mercurius.oauth2.resource;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public Map<String, Object> hello(Principal principal) {
		System.out.println("received request from " + principal.getName());
		Map<String, Object> result = new HashMap<>();
		result.put("id", UUID.randomUUID().toString());
		result.put("content", "Hello, world!");
		result.put("caller", principal.getName());
		return result;
	}

}
