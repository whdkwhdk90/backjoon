package backjoon;

import java.util.Scanner;

public class 별찍기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int num =0;
		int num1 = 1;
		int num2= 1;
		for(num = 1; num <= (N*(N+1)/2); num++)
		{
			
			System.out.print("*");
				
			if( num == num1) {
				System.out.print("\n");
				num2++;
				num1=num1+num2;
			
			}
			
		
		}

		
		
		
		
	}
}
