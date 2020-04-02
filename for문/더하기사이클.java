package backjoon;

import java.util.Scanner;

public class 더하기사이클 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int num1 =0, num2=0, num3 =0;
		int num4 = num;
if(num <10) 

{
	for(int i = 0; ;i++) 
	{
		num1 = num4/10;
		num2 = num4%10;
		num3 = num1+num2;
		count++;
		if(num != (num2*10+num3%10)) {
			num4 = num2*10+num3%10;	
		}else{
			break;
		}
	}		
		
		}
else {
			for(int i = 0; ;i++) 
			{
				num1 = num4/10;
				num2 = num4%10;
				num3 = num1+num2;
				count++;
				if(num != (num2*10+num3%10)) {
					num4 = num2*10+num3%10;	
				}else{
					break;
				}
			}
	}
		System.out.println(count);
  }
	
	
}



