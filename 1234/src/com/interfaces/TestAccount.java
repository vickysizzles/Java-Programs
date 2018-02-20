package com.interfaces;

public class TestAccount {
	public static void main(String[] args) {
		account da=new Depositaccount();
		da.withdrawamount(100000);
		da.openaccount();
		da.depositamount(200005);
		da.closeaccount();
		account ca=new Currentaccount();
		ca.withdrawamount(5265978);
		ca.openaccount();
		ca.depositamount(896546);
		ca.closeaccount();
	}
      
		
        
}
