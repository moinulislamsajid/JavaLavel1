package JavaLevel1;

import java.util.Scanner;

public class Factorial {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fact=1,num;
		System.out.print("Enter Any number : ");
		num = input.nextInt();
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is : "+fact);
		

	}

}
