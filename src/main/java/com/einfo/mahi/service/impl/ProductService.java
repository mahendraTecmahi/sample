package com.einfo.mahi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einfo.mahi.model.Product;
import com.einfo.mahi.repo.ProductRepository;
import com.einfo.mahi.service.IProductService;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public Integer saveProduct(Product p) {
		return repository.save(p).getProdId();
	}
}
