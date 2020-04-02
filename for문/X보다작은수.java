package backjoon;

import java.util.Scanner;
import java.util.StringTokenizer;


public class X보다작은수 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String sc1 = sc.nextLine();
		
		StringTokenizer st1 = new StringTokenizer(sc1, " ");
		
		String Nstr = st1.nextToken();
		String Xstr = st1.nextToken();
		
		int N = Integer.parseInt(Nstr);
		int X = Integer.parseInt(Xstr);
		
		
		String sc2 = sc.nextLine();
		
		StringTokenizer st2 = new StringTokenizer(sc2, " ");
		
		
		for(int i =1; i <= N; i++ ) {
		String comp = st2.nextToken();
		int com = Integer.parseInt(comp);
		
		if(X > com) {
			System.out.print(com + " ");
		}
			
			
		}
	}
		
	
		
		
		
}
