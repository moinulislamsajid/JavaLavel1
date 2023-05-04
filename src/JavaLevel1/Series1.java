package JavaLevel1;

import java.util.Scanner;

public class Series1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num,sum=0;
		System.out.print("Enter the last number : ");
		num = input.nextInt();
		for(int i=1; i<=num;i++) {
			System.out.print(i+" ");
			sum = sum+i*i;
		}
		System.out.println("\nSum is : "+sum);

	}

}
