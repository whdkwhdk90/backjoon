package backjoon;

import java.util.Scanner;

public class 손익분기점{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long fi = sc.nextLong();
        long br = sc.nextLong();
        long price = sc.nextLong();
        long gap = 0;
        gap = price -br;
        
        
if(gap>0){
       System.out.println((fi/gap)+1);   
	}else{
    System.out.println(-1);
	}
       
   }
}    
    