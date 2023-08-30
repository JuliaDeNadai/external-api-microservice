package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDTO;
import com.example.demo.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductsController {

  private final ProductService productService;

  @GetMapping(path = "/products")
	public ResponseEntity<Map<String, Object>> getProducts() {

		try {
			List<ProductDTO> products = productService.getAllProducts();
      System.out.print(products);

      Map<String, Object> response = new HashMap<>();
      response.put("data", products);
  
      return new ResponseEntity<>(response, HttpStatus.ACCEPTED);

		} catch (Exception e) {
			System.out.print("eroo" + e);
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
  
}

