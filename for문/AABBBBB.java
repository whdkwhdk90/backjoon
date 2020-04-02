package backjoon;

import java.util.Scanner;

public class AABBBBB {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		
		for(int i =1; i <= T; i++) {
			
			byte A = sc.nextByte();
			byte B = sc.nextByte();
			System.out.println("Case #"+ i+ ": " + (A+B));
		}
		
		
		
	}
}
