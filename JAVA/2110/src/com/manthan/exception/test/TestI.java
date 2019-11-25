package com.manthan.exception.test;

public class TestI {

	public static void main(String[] args) {
		ATMSimulator a = new ATMSimulator();
		try {
		a.verify(100000);
		}
		catch(DayLimitException d) {
			d.printStackTrace();
		}
	}

}
