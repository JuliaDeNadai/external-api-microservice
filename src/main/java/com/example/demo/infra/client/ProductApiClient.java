package com.example.demo.infra.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.ProductDTO;

@FeignClient(value = "product-api", url = "${product-api.v1.url:#{null}}")
public interface ProductApiClient {
  @GetMapping("/products")
  List<ProductDTO> getAllProducts();
}
