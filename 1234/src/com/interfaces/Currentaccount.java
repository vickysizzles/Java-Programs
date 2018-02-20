package com.interfaces;

public class Currentaccount implements account {

	@Override
	public void openaccount() {
		System.out.println("Account is activated");
		
	}

	@Override
	public void closeaccount() {
		System.out.println("Deactivate the account");
		
	}

	@Override
	public void withdrawamount(int amount) {
	     System.out.println(amount+"Withdraw amount");
		
	}

	@Override
	public void depositamount(int amount) {
		System.out.println("amount is deposited");
		
	}

	
	}

