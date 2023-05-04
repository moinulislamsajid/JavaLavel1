package JavaLevel1;

import java.util.Scanner;

public class pattern1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	int num;
	System.out.print("Enter any number : ");
	num = input.nextInt();
	for(int i =1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" "+i%2);// j%2,*,i%2,i,j
		}
		System.out.println("\n");
	}
	

	}

}
