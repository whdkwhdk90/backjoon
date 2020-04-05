package backjoon;

import java.util.Scanner;

public class º°Âï±â9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
for(int i=1; i<=2*num-1;i++) 
			{ 
				if(i<=num) {
					for(int j = 1; j <= 2*num-1; j++) 
					{
							if(j<i || j>2*num-i) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
					}	
				}
				else{
					for(int j = 1; j <= 2*num-1; j++) 
					{
							if(j>i || j<2*num-i) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
					}	
				}		
				System.out.println();
			}
	}
}
