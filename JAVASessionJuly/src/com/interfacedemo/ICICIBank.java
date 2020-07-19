package com.interfacedemo;



public class ICICIBank implements RBIBody {

	@Override
	public void createAccount() {
		System.out.println("Creating Account");
		
	}

	@Override
	public void depositMoney() {
		System.out.println("Depositing Money");
		
	}

	@Override
	public void debitCard() {
		System.out.println("Debit Card");
		
	}
	
	public void creditCard() {
		System.out.println("Credit Card");
	}




}
