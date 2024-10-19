package com.Vending.vending.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vending.Request.SelectProductReq;
import com.Vending.vending.entity.Product;
import com.Vending.vending.repository.ProductRepository;




@Service
public class VendorService {
	
	@Autowired
	ProductRepository productRepository;
	
	
	
	public List<Product> fetchProducts() {
		
	return productRepository.findAll();
	}

	public String addCash(double cashAmount) {
		
		return "The inserted amount is: " + cashAmount;
	
	}


	public String selectProducts(SelectProductReq selectProducyReq) {
		 int quantity = selectProducyReq.getProductQuantity();
		
		long id = selectProducyReq.getProductid();
		 
		 
		@SuppressWarnings("deprecation")
		Product product = productRepository.getById(id);
		
		double totalPrice = product.getPrice()*quantity;
		
		double changeAmount =  selectProducyReq.getAmount() - totalPrice;
		
		return " The balance amount is : " + changeAmount;
	                     
		
	}
	  
}
