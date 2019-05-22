package com.hcl.shopperscard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.shopperscard.entity.Products;
import com.hcl.shopperscard.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	@Override
	public Products getProduct(Long productId) {
		return productRepository.getOne(productId);
	}

}
