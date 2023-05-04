package JavaLevel1;

import java.util.Scanner;

public class FibonacciSeries {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibonacci Series
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter How Many Number : ");
		num = input.nextInt();
		int first_Number = 0;
		int second_Number = 1;
		int fibo;
		System.out.print(first_Number+" "+second_Number);
		for(int i=3;i<=num;i++){
			fibo = first_Number + second_Number;
			System.out.print(" "+fibo);
			first_Number = second_Number;
			second_Number = fibo;
		}
		

	}

}
