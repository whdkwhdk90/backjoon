package backjoon;

import java.util.Scanner;

public class 분수찾기{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
     int i = 1;
        
 while(true){
     if(num <= (i*(i+1)/2)){
             if((i%2) !=0){
                 System.out.println(((i+1)-(num-((i-1)*i/2)))+"/"+(num-((i-1)*i/2)));
                 break;
             }else{
                 System.out.println((num-((i-1)*i/2))+"/"+((i+1)-(num-((i-1)*i/2))));
                 break;
             }
     }
     i++;
   
 }

    }
}