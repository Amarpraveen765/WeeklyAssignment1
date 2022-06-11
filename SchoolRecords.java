package com.prodapt.codingassignment1;

public class SchoolRecords {
	String School_name;
	int School_ID;
	String School_Address;
	void ddRecords(String a,int b,String c) {
		School_name = a;
		School_ID = b;
		School_Address = c;
		
	}
	void dispRecords() {
		System.out.println("School name: "+School_name);
		System.out.println("School ID: "+School_ID);
		System.out.println("School Address: "+School_Address);
		
	}

}
