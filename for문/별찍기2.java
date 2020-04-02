package backjoon;

import java.util.Scanner;

public class 별찍기2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i <= N; i++)
		{
					for(int j = N; j >= 1; j--)
					{
						
						if(i >= j) {
							System.out.print("*");				
						}else {System.out.print(" ");}
						
					}
					System.out.print("\n");
		}
		
		
	}
}

 