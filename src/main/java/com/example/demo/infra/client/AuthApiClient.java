package com.example.demo.infra.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "auth-api", url = "${auth-api.v1.url:#{null}}")
public interface AuthApiClient {
  
  @GetMapping("/healthcheck")
  String healthcheck();
}
