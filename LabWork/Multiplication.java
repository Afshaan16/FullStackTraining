package LabWork;

import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		System.out.println("Enter nos for Multiplication!");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First No.:");
		int a=input.nextInt();
		System.out.println("Enter Second No.:");
		int b=input.nextInt();
		int mul=a*b;
		System.out.println("The product of two nos is: "+mul);
		
		
	}

}
