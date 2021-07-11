package LabWork;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the radius of Circle:");
		double rad=input.nextDouble();
		double area=Math.PI*(rad*rad);
		System.out.println("The area of Circle is: "+area);
		double circum=Math.PI*2*rad;
		System.out.println("The Circumference of Circle is: "+circum);
		
	}

}
