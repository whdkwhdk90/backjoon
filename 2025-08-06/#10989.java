import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] iArr = new int[total];

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<total; i++) {
            iArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(iArr);

        for (int i=0; i<iArr.length; i++) {
            sb.append(iArr[i]).append("\n");
        }
        
        System.out.println(sb);
    }
}