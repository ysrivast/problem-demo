package com.zalando.demo.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zalando.demo.exception.UserNotFoundException;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/users")
public class UserController {
	
	@GetMapping("/{id}")
	public ResponseEntity<Void> getUserById(@PathVariable final Long id) {
		log.info("request for user id : {} ",id);
		throw new UserNotFoundException(URI.create("https://example.org/not-found"));
	}
	
}
