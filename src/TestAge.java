  package com.p;

public class TestAge {
static void checkAge(int a) {
	if(a<1) {
		try {
			throw new InvalidAgeException("Age should be greater than 0");		
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	else {
		System.out.println("age is "+a);
	}
}
public static void main(String[] args)  {
	TestAge.checkAge(-1);
	TestAge.checkAge(10);
}
}
