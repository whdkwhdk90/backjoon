package backjoon;

import java.util.Scanner;

<<<<<<< HEAD
public class  ë³„ì°ê¸°9 {
=======
public class º°Âï±â9 {
>>>>>>> 721683e40a90d1461a5abf6e79db14c15103c3b2
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
for(int i=1; i<=2*num-1;i++) 
			{ 
				if(i<=num) {
					for(int j = 1; j <= 2*num-1; j++) 
					{
							if(j<i || j>2*num-i) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
					}	
				}
				else{
					for(int j = 1; j <= 2*num-1; j++) 
					{
							if(j>i || j<2*num-i) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
					}	
				}		
				System.out.println();
<<<<<<< HEAD
				
			}
	}
	
		
	
	
}
=======
			}
	}
}
>>>>>>> 721683e40a90d1461a5abf6e79db14c15103c3b2
