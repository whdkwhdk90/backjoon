package backjoon;

import java.util.Scanner;

public class 평균은넘겠지{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sum = 0;
        double gap = 0;
        int count = 0;
        double[] iarr = new double[1000];
        
        
        for(int i = 0; i <num; i++){
            
            int num1 = sc.nextInt();
            iarr = new double[num1];
            for(int j = 0; j <num1; j++){      	
                gap = sc.nextDouble();
                iarr[j] = gap;
                sum += gap; 
            }
            
            for(int j = 0; j <num1; j++){
                	if((sum/num1) < iarr[j]) {
                		count++;
                		iarr[j] = 0;
                	}
            }        
            System.out.printf("%.3f%%",count*1000/(num1*10.000));
            sum =0;
            gap = 0;     
            count =0;
        } 
        
    }
}