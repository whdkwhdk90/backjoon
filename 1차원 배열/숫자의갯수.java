package backjoon;

import java.util.Scanner;

public class 숫자의갯수 {
		public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				int[] iarr = new int[9];
				int num = 0;
				int tot = 1;
				int num1=0;
				int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0,k=0;
					
		for(int i = 0; i <3; i++) {
				num =sc.nextInt();
				tot *= num;
			}		
		int length = (int)(Math.log10(tot)+1);
		String str = Integer.toString(tot);
		
			for(int i =0; i <length; i++) {
				iarr[i] = Character.getNumericValue(str.charAt(i));
				if(iarr[i] ==0) {
					a++;
				}else if(iarr[i] ==1) {
					b++;
				}else if(iarr[i] ==2) {
					c++;
				}
				else if(iarr[i] ==3) {
					d++;
				}
				else if(iarr[i] ==4) {
					e++;
				}
				else if(iarr[i] ==5) {
					f++;
				}
				else if(iarr[i] ==6) {
					g++;
				}
				else if(iarr[i] ==7) {
					h++;
				}else if(iarr[i] ==8) {
					j++;
				}else if(iarr[i] ==9) {
					k++;
				}
				
			}

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(j);
System.out.println(k);
			
			
	}
	
			
				
}
