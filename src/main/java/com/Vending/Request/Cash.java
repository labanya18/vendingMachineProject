package com.Vending.Request;

import lombok.Data;

@Data
public class Cash {
	private double cashAmount;



public double getCashAmount() {
	return cashAmount;
}

public void setCashAmount(double cashAmount) {
	this.cashAmount = cashAmount;
}
}