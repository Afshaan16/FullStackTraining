package LabWork;

import java.util.Scanner;
public class Print_Integer {
	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner reader= new Scanner(System.in);
		int number=reader.nextInt();
		System.out.println("The entered number is: "+ number);
	}

}
