package com.example.demo.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import com.example.demo.infra.client.AuthApiClient;

@Service
@RequiredArgsConstructor
public class AuthApiService {
  
	private final AuthApiClient authApiClient;

  public String healthcheck() {
    return authApiClient.healthcheck();
  }
}
