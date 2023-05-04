package JavaLevel1;

import java.util.Scanner;

public class Sum10number {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum=0,rem,num;
		System.out.print("Enter number : ");
		num = input.nextInt();
		while(num>0) {
			rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println("Sum Is : "+sum);
		
	}

}
