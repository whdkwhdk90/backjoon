package backjoon;

import java.util.Scanner;

public class 알람시계 {
	public static void main(String[] args) {
		int H,M,S;
		Scanner sc = new Scanner(System.in);
		
		H = sc.nextInt(); 
				
		
		
		
		if(H==0) 
		{   M = sc.nextInt();
			S = (1440 + M);
			S = (S-45);
			System.out.println(((S/60)%24)+" "+(S%60));
		}
		
		
		else {
			M = sc.nextInt();
			S = (60*H+M);
			S = (S-45);
			System.out.println((S/60)+" "+(S%60));
			
		}
		

		
	}
	
	
}
