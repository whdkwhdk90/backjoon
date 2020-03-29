package backjoon;

import java.util.Scanner;

public class ±¸±¸´Ü {
	public static void main(String[] args) {
		
		byte a;
		
		Scanner sc = new Scanner(System.in);
		
		a= sc.nextByte();
		
		for(byte i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", a,i,(a*i));
			
			
		}
		
		
		
	}
}
