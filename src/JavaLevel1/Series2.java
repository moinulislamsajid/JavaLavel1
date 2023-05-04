package JavaLevel1;

import java.util.Scanner;

public class Series2 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multiplication Series
		Scanner input = new Scanner(System.in);
		int num,mul=1;
		System.out.print("Enter the last number : ");
		num = input.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println(i+" ");
			mul = mul * i;
		}
		System.out.println("\nMultiplication is : "+mul);
		
		

	}

}
