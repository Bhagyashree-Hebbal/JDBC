package com.xworkz.food.boot;

public class Screwdriver {

	static {
		System.out.println("this is static block");
	}
	{
		System.out.println("this is instance block");
	}
}
