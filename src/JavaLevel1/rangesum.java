package JavaLevel1;

import java.util.Scanner;

public class rangesum {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int in,fi,sum=0;
		System.out.print("Enter initialnumber : ");
		in = input.nextInt();
		System.out.print("Enter finalnumber : ");
		fi = input.nextInt();
		for(int i=in;i<=fi;i++)
		{
			sum = sum +i;
			
		
	}
		System.out.println("Sum : "+sum);
	}
}


