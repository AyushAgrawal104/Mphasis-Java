package com;

public class Bank {

	private int accNo;
	private double bal = 1000;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public void withDraw(double amt) {

		if (amt <= bal) {
			System.out.println("-- " + amt + " With drawn");
			bal = bal - amt;
			System.out.println("-- Available Balance is " + bal);
		}else {
			throw new InsuficentFundsException("Insuffient Funds. Add Funds to Account");
		}
			
			
		System.out.println("---- Statement 1");
		System.out.println("---- Statement 2");
	}

}
