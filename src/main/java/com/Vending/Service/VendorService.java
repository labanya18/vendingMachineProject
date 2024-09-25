package com.Vending.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vending.entity.Product;
import com.Vending.repository.ProductRepository;


@Service
public class VendorService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> fetchProducts() {
		
	return productRepository.findAll();
	}
	  
}
