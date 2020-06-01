package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 수정렬하기2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num;
		int num1;
		int i =0;
		try {
			num = Integer.parseInt(br.readLine());
			System.out.println(num);
			List<Integer> list = new ArrayList<>(num);
			
			while(i< num) {
			num1 = Integer.parseInt(br.readLine());
				list.add(i, num1);
				i++;
				System.out.println(num1);
			}
		Collections.sort(list);
			
			for(Integer innum : list) {
				bw.write(innum+"\n");
			}
			bw.close();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
