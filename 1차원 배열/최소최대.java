package backjoon;

import java.util.Scanner;

public class 최소최대 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
			
		long[] iarr = new long[1000000];
		long max =0, min =1000000;
	     int num1=0;
	     
for(int i = 0; i <num; i++) {
	num1 = sc.nextInt();
	iarr[i] = num1;
}	     
	max = iarr[0];
	min = iarr[0];
	     
for(int i = 0; i <num; i++)
				{
					
				
					if(max <=iarr[i]) {
						max = iarr[i];
					}
					if(min >= iarr[i]) {
						min = iarr[i];
					}
					
				}		
		
		System.out.println(min+" "+max);



	}
}
