package JavaLevel1;

import java.util.Scanner;

public class pattern2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter Any integer number : ");
		num = input.nextInt();
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"); // i,j,i%2,j%2
			}
			System.out.println("\n");
		}

	}

}
