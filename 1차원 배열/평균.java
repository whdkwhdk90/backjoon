package backjoon;

import java.util.Scanner;

public class 평균{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double max = 0;
        double sum = 0;
        double[] iarr = new double[num];
        
     for(int i = 0; i<num;i++){
         iarr[i] = sc.nextDouble();
         if(iarr[i] >= max){
             max = iarr[i];
         }    
     } 
        
        
    for(int i = 0; i<num; i++){
        iarr[i] = iarr[i]*100/max;
        sum += iarr[i];
    }    
        System.out.println(sum/num);
        
        
        
        
        
        
        
        
        
    }
}