package com.prodapt.codingassignment1;

public class SimpleInterest {
	void SI(int p,int t, int r) {
		int si,total;
		si=(p*t*r)/100;
		total = p+si;
		System.out.println("Total amount to be paid after Loan duration ends is: "+total);
		
	}

}
