package com.practice.git;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		HelloWorld myHelloWorldobject = new HelloWorld();
		myHelloWorldobject.addition(5,4);
	}
	
	
	public void addition(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("num1: " + num1 + ", num2: " + num2);
		System.out.println("num1 + num2 = " + result);
	}
}
