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
                total += val * 3;
            } else {
                total += val;
            }
        }

        total %= 10;
        if (checkedIndex % 2 == 1) {
            System.out.println((10 - total) / 3);
        } else {
            System.out.println(10 - total);
        }
    }
}