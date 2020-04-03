package backjoon;

import java.util.Scanner;

public class 세가지수 {
	public static void main(String[] args) {
		
		int mid=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		
		
		if(num >= num1) {
				if(num1 >= num2) {
					mid = num1;
				}else {
					if(num >= num2) {
						mid = num2;
					}else {
						mid = num;
					}
				}	
			
		}else {
					if(num >=num2) {
						mid = num;
					}else {
						if(num1 >= num2) {
							mid = num2;
						}else {
							mid = num1;
						}
						
					}
				
		}
		
		
		System.out.println(mid);
		
	}
}
