package backjoon;

import java.util.Scanner;


public class X보다작은수 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		char Nch = sc.next().charAt(0);
		char Xch = sc.next().charAt(2);
		
		int N = (int)(Nch);
		int X = (int)(Xch);
		
		String A = sc.next();
		
		int n;
		char Ach;
		
		for(int i = 1; i <= N; i++) {
					n = 0;
				Ach = sc.next().charAt(2*n);
					n = n+1;
				if(X > (int)(Ach)) {
					System.out.print((int)(Ach) + " ");
				}
		
		}	
		
		
		
		
		
		
	}
}
