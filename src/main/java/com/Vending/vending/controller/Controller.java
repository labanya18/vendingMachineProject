package com.Vending.vending.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vending.Request.Cash;
import com.Vending.Request.SelectProductReq;
import com.Vending.vending.entity.Product;
import com.Vending.vending.service.VendorService;


@RestController
public class Controller {
	
	
	@Autowired
	VendorService vendorService;

	@GetMapping("/getProducts")
	public List<Product> fetchProducts() {
		return vendorService.fetchProducts();
		
	}
	
	
	
	@PostMapping(value = "/addCash")
	public String addCash(@RequestBody Cash cash) {
		return vendorService.addCash(cash.getCashAmount());
		
	}
	
	@PostMapping(value = "/buyProduct")
	public String selectProduct(@RequestBody SelectProductReq selectProducyReq) {
		return vendorService.selectProducts(selectProducyReq);
		
	}
}
