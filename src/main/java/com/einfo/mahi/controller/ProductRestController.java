package com.einfo.mahi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einfo.mahi.model.Product;
import com.einfo.mahi.service.IProductService;

@RestController
@RequestMapping("/products")
public class ProductRestController {

	@Autowired
	private IProductService service;

	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {
		Integer id = service.saveProduct(product);
		return new ResponseEntity<String>("Product '" + id + "'saved successfully", HttpStatus.OK);
	}
}
