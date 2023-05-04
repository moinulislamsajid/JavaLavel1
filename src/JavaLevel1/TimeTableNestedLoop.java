package JavaLevel1;

import java.util.Scanner;

public class TimeTableNestedLoop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n,m;
		System.out.print("Enter inittial Value : ");
		n = input.nextInt();
		System.out.print("Enter final Value : ");
		m = input.nextInt();
		for(int i=n;i<=m;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
			System.out.println("\n\n");
		}


		
	}

}
