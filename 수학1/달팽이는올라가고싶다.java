package backjoon;

import java.util.Scanner;

public class 달팽이는올라가고싶다 {
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	
		int U = sc.nextInt();
		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = 0, C = 0;
		C = ((T-D)/(U-D));
		if((T-D)%(U-D) != 0) {
			C++;
		}	
	System.out.println(C);	
	}
}



