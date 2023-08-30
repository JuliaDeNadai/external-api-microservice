package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductDTO;
import com.example.demo.infra.client.ProductApiClient;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {

  private final ProductApiClient productApiClient;

  public List<ProductDTO> getAllProducts() {
    return productApiClient.getAllProducts();
  }
}
