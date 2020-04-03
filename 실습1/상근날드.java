package backjoon;

import java.util.Scanner;

public class 상근날드 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int min1=0, min2 =0;
		int num1, num2, num3;
		int num;
		
for(int i =0; i < 5; i++) {
		
		if(i ==0) {
							num = sc.nextInt();
							min1 = num;
		}else if( i <=2)
		{
							num = sc.nextInt();		
							if(min1 >= num) {
								min1 = num;
							}
						}					
		else {
							num2 =sc.nextInt();
							num3 = sc.nextInt();
							if(num2 >= num3) {
								min2 = num3;
							}else {
								min2 = num2;
							}
							break;
			}
	
}		
			System.out.println(min1+min2-50);
		
	}
}
