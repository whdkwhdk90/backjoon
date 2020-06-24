package backjoon;

import java.util.Scanner;

public class 소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean t = true;
		int count = 0;
		for(int i=0; i<number;i++) {
			int val = sc.nextInt();
			if(val <=1) {
				continue;
			}else{
				for(int j=2; j<val/2; j++){
					if(val % j == 0) {
						t = false;
						break;
					}
				}
				if(t) {
				count++;		
				};
				
			}
		};
		System.out.println(count);
		sc.close();
		
		
	}
}
