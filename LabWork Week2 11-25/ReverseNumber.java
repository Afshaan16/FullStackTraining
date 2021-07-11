package LabWork;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		int num=0,reverse=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice of number:");
		num=input.nextInt();
		while(num!=0) {
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
		System.out.println("Reverse of number is:"+reverse);
	}

}
