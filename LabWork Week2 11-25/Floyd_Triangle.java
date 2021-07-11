package LabWork;
import java.util.Scanner;
public class Floyd_Triangle {
	public static void main(String[] args) {
		int i,j,number=5,rows;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no. of rows for Floyd's Triangle");
		rows=input.nextInt();
		System.out.println("********Floyd's Triangle********");
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(number+" ");
			}
			System.out.println();
		}
	}
	
	

}
