package JavaLevel1;

import java.util.Scanner;

public class TimeTable {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multiplication
		Scanner input = new Scanner(System.in);
		int num,mul=1;
		System.out.print("Enter any integer number : ");
		num = input.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+num*i);// System.out.println(num+" X "+i+" = "+num*i);
		}
			

	}

}
