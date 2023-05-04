package JavaLevel1;

import java.util.Scanner;

public class patternAssignment2 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter Any Number : ");
		num = input.nextInt();
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i%2);
			}
			System.out.println("\n");
		}

	}

}
