import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int total = 0;
        int val;
        int checkedIndex = 0;
        for (int i=0; i<str.length(); i++) {
            val = str.charAt(i) - 48;
            if (val > 9 || val < 0) {
                checkedIndex = i;
                continue;
            }

            if (i % 2 == 1) {
                total += (val * 3) % 10 ;
            } else {
                total += val % 10;
            }

            total %= 10;
        }

        int answer = 0;
        int temp = 0;
        while (true){
            if (checkedIndex % 2 == 1) {
                temp = answer * 3 + total;
            } else {
                temp = answer + total;
            }

            if (temp % 10 == 0) {
                System.out.println(answer);
                break;
            } 

            answer++;
        }
    }
}