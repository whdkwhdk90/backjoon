package backjoon;

import java.util.Scanner;

public class 최댓값 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int[] iarr = new int[9];
		int count =0;
for(int i =0; i < 9; i++) {
	 	num = sc.nextInt();
	 	iarr[i] = num;
}		
     int max = iarr[0];		
		
for(int i = 0; i <9; i++) {
			if(max <= iarr[i]) {
				max = iarr[i];
				count = i;
			}
	
}		
     
System.out.println(max); 
System.out.println(count+1);
     
	}
}
