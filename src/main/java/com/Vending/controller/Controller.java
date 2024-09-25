package com.Vending.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vending.Service.VendorService;
import com.Vending.entity.Product;

@RequestMapping("/vending")
@RestController
public class Controller {
	
	
	@Autowired
	VendorService vendorService;

	@GetMapping("/getProducts")
	public List<Product> fetchProducts() {
		return vendorService.fetchProducts();
		
	}
	
}
