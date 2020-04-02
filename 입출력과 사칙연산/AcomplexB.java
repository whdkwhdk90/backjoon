package backjoon;

import java.util.Scanner;

public class AcomplexB {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		short a,b;
		a = sc.nextShort();
		b = sc.nextShort();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}
