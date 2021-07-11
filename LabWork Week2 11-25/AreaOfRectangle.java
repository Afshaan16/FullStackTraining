package LabWork;
import java.util.Scanner;
public class AreaOfRectangle{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle: ");
		double len=input.nextDouble();
		System.out.println("Enter the width of Rectangle: ");
		double width=input.nextDouble();
		double area=len*width;
		System.out.println("The area of Rectangle is:"+area);
	}

}
