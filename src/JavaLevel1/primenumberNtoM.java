package JavaLevel1;

import java.util.Scanner;

public class primenumberNtoM {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m,count=0,totalprime=0;
		System.out.print("Enter initial Number : ");
		n = input.nextInt();
		System.out.print("Enter final Number : ");
		m = input.nextInt();
		for(int i=n;i<=m;i++) {
			for(int j=2;j<i-1;j++) {  // for(int j=2;j<i-1;j++)
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
				totalprime++;
			}
			count=0;
			
		}
		System.out.println("Total Prime number : "+totalprime);

		

		
		
	}

}
