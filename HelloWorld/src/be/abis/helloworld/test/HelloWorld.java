package be.abis.helloworld.test;

import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args)
	{
		String myName;
		
		Scanner readInput = new Scanner(System.in);
		System.out.println("Please enter a your name:");
		myName	       = readInput.next();
		System.out.println("Hello " +myName);
	}	
}