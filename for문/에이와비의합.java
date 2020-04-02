package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 에이와비의합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	long t = Long.parseLong(br.readLine());
	
	
	for(int i =1; i <= t; i++ ) {
		
		String br1 = br.readLine();
		StringTokenizer token = new StringTokenizer(br1);
		int a = Integer.parseInt(token.nextToken(" "));
		int b = Integer.parseInt(token.nextToken(" "));
		System.out.println(a+b);
		
		
		
	}
	
	}

	
	}
