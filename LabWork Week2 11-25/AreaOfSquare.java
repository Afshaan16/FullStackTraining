package LabWork;
import java.util.Scanner;
public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the side of Square:");
		double side=input.nextDouble();
		double area=side*side;
		System.out.println("The area of Square is: "+area);
		
	}

}
