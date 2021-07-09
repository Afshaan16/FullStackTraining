package LabWork;

public class LargestNumber {
	public static void main(String[] args) {
		double n1 = -10, n2 = 16.89, n3 = 9.3; 
		if( n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the Largest number"); 
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the Largest number"); 
		else
			System.out.println(n3 + " is the Largest number"); 
	}

}
