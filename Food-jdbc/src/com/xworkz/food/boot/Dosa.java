package com.xworkz.food.boot;

public class Dosa {

	static {
		System.out.println("this is static block");
	}

	{
		System.out.println("this is instance block");
	}
}
