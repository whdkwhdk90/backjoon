package backjoon;

import java.util.Scanner;

public class º°Âï±â21 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		
if(num ==1) {
	System.out.println("*");
}
	
else {
	for(int i = 1; i<=num; i++) {
				for(int j=1; j<=num; j++) {
					if(j%2==1) {
						System.out.print("* ");
					}	
				}System.out.println();
				for(int j=1; j<num; j++) {
					if(j%2==1) {
						System.out.print(" *");
					}			
				}System.out.println();
	
			}
		}	
	}		
}

