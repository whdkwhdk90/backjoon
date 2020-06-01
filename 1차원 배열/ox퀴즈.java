package backjoon;

import java.util.Scanner;

public class ox퀴즈 {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		int num = sc.nextInt();
		int i =0;
		int sum =0;
		while(i <num) {
			str = sc.next();
			String[] sarr = str.split("X");
				for(int j = 0; j<sarr.length; j++) {
					sum += sarr[j].length()*(sarr[j].length()+1)/2;
				}
				System.out.println(sum);
				sum = 0;
				i++;
			
		}
		
		
		
		
	}
}
