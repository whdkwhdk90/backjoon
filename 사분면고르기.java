package backjoon;

import java.util.Scanner;

public class ��и���� {
	public static void main(String[] args) {

		short x,y;
		
		Scanner sc = new Scanner(System.in);
		
			x=sc.nextShort();
			y=sc.nextShort();
		
		if ( (x>0) && (y>0)) {
				System.out.println("1");
		}
		else if( (x>0) && (y<0)) {
			System.out.println("4");
	}   else if( (x<0) && (y<0)) {
		System.out.println("3");
}		else {
		System.out.println("2");
		
		
}
					
	}
	
	
}
