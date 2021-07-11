package LabWork;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the height of triangle:");
		double height=input.nextDouble();
		System.out.println("Enter the width of triangle:");
		double width=input.nextDouble();
		double area=(height*width)/2;
		System.out.println("The area of triangle is "+area);
		
	}

}
