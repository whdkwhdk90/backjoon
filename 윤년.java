package backjoon;

import java.util.Scanner;


public class À±³â {
	public static void main(String[] args) {
		
		short a;
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextShort();
		
		
		
		
		
		if( a%4 == 0)
		{				
			if ( ((a%100) != 0) | ((a%400) ==0) ) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
			
		}
		else {
					System.out.println("0");
				}	
					
		}
		
		
		
	}

