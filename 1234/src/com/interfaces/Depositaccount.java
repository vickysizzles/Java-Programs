package com.interfaces;

public class Depositaccount implements account {

	@Override
	public void openaccount() {
		System.out.println("Account is opened");
		
	}

	@Override
	public void closeaccount() {
		System.out.println("Account is closed");
		
	}

	@Override
	public void withdrawamount(int amount) {
		System.out.println(amount+"withdraw from deposit");
		
	}

	@Override
	public void depositamount(int amount) {
		System.out.println(amount+"Deposit");
		
	}

	
	    

}
