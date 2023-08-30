package com.example.demo.service;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductDTO;
import com.example.demo.infra.client.ProductApiClient;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {

  private final ProductApiClient productApiClient;

  @Cacheable("products")
  public List<ProductDTO> getAllProducts() {
    return productApiClient.getAllProducts();
  }

  @Cacheable("products")
  public ProductDTO getProductById(int id){
    return productApiClient.getProductById(id);
  }

  @Cacheable("products")
  public String getCache() {
    String str = "abc";

    System.out.print("Buscando itemsss ....................");
    return str;
  }
}
