package com.shi;

public class Student {
	
	int studId;
	
	String studName;
	
	double examFee; 
	
	void displayDetails() {
		
		
	}
	
	void payFree() {
		
		double p = 20000;
		
		System.out.println("Pending "+p);
		
	}
	
}

class DayScholar extends Student {
	
	double transportFee;
	
}

class Hosteller extends Student {
	
	double hostelFee;
	
}

class Sudent {
	
	public static void main(String[] args) {
		
		DayScholar d1 = new DayScholar();
		
		System.out.println(d1.studId = 12345);
		
		System.out.println(d1.studName = "Shivani");
		
		System.out.println(d1.examFee = 7000);
		
		d1.payFree();
		
		System.out.println(d1.transportFee = 1000);
		
		Hosteller h1 = new Hosteller();
		
		System.out.println(h1.studId = 78945);
		
		System.out.println(h1.studName = "Shalu");
		
		System.out.println(h1.examFee = 8000);
		
		h1.payFree();
		
		System.out.println(h1.hostelFee = 2500);
		
	}
}	
