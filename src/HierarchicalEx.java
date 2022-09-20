package com.p;

class Vehicle{
	void usage() {
		System.out.println("transportation....");
	}
}

class Bike extends Vehicle{
	void bike() {
		System.out.println("2 wheel drive");
	}
}

class Car extends Vehicle{
	void car() {
		System.out.println("4 wheel drive");
	}
}

public class HierarchicalEx extends Car{
	public static void main(String[] args) {
		Car c =new Car();
		c.car();
		c.usage();
	}
	
}
