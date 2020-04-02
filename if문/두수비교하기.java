package backjoon;

import java.util.Scanner;

public class 두수비교하기 {
	public static void main(String[] args) {
		
		short a,b;
		
		Scanner sc = new Scanner(System.in);
		
		a= sc.nextShort();
		b= sc.nextShort();
		
		if(a>b) {
			System.out.println(">");
		} else if(a<b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}
