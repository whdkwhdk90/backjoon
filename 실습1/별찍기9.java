package backjoon;

import java.util.Scanner;

public class º°Âï±â9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
for(int i=1; i<=2*num-1;i++) 
			{ 
				if( i <= num) {
						for(int j = 1; j <= 2*num-1; j++) {
							System.out.print("*");
							if(j  < i || j > 2*num-i) {
								System.out.print(" ");
							}						
						}System.out.println();
					
				}else {
						for(int j = i; j >= 2*num-i; j--) {
							System.out.print("*");
							if(j <i || j > 2*num-1) {
								System.out.print(" ");
							}
						}System.out.println();
									
				}
					
	
			}		
		
	
	}
}
