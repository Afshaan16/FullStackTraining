package LabWork;
import java.util.Scanner;
public class while_loop {
	public static void main(String[] args) {
		int sum=0,number;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any Integer Value below 10:");
		number=input.nextInt();
		while(number<=10) {
			sum=sum+number;
			number++;
		}
		System.out.println("Sum is:"+sum);
	}

}
