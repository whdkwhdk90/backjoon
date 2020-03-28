package backjoon;

import java.util.Scanner;

public class ³ª¸ÓÁö {
	public static void main(String[] args) {
		short A,B,C;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextShort();
		B = sc.nextShort();
		C = sc.nextShort();
		
		
		
		System.out.println(((A+B)%C));
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
	}
}
