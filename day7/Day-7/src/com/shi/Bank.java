package com.shi;

public class Bank {
	
	String branchName;
	
	String Name;
	
	String ifscCode;
	
	int rateOfInterest;
	
	void displayDetails() {
		
		
	}
	
}

class AxisBank extends Bank {
	
	@Override
	
	void displayDetails() {
		
		System.out.println(branchName="xyzxyz");
		
		System.out.println(Name="xyz");
		
		System.out.println(ifscCode="uvw");
		
		System.out.println(rateOfInterest=5);
		
	}
	
	void getCreaditCard() {
		
		System.out.println("Get The Creadit Card from the Axis bank");
		
	}
}

class ICICBank extends Bank {
	
	@Override
	
	void displayDetails() {
		
		System.out.println(branchName="ijk");
		
		System.out.println(Name="jkl");
		
		System.out.println(ifscCode="mno");
		
		System.out.println(rateOfInterest=7);
		
	}
	
}

