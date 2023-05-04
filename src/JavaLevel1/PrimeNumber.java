package JavaLevel1;

import java.util.Scanner;

public class PrimeNumber {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num,count=0;
		System.out.print("ENter Any number to check prime or not : ");
		num = input.nextInt();
		if(num==0 || num==1) {
			System.out.println("Not a Prime number");
		}
		else {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		}
		if(count==0) {
			System.out.println("This is a Prime Number");
		}
		else {
			System.out.println("This is Not a Prime Number");

		}

	}

}
