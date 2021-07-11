package LabWork;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		int tech;
		System.out.println("Enter you choice of Tech:\n1: Java\n2:Python");
		Scanner input=new Scanner(System.in);
		tech=input.nextInt();
		switch(tech) {
		case 1:
		{
			System.out.println("You have selected Java");
			break;
		}
		case 2:
		{
			System.out.println("You have selected Python");
			break;
		}
		default:
		{
			System.out.println("Not Listed");
		}
		}
	}

}
