import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
         
        if (n == 1) {
            System.out.println(1);
            return;
        }

        long sum = 0;
        for (long i=1; i<n; i++) {
            sum += i;
            if (n <= (sum * 6) + 1) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
