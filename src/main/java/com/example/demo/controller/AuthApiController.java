package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AuthApiService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthApiController{

  private final AuthApiService authApiService;

	@GetMapping(path = "/authapi")
	public ResponseEntity<Object> halthcheck() {

		try {
			String result = authApiService.healthcheck();
      System.out.print(result);

		} catch (Exception e) {
			System.out.print("eroo" + e);
		}

    return new ResponseEntity<>(HttpStatus.CREATED);
	}
}