import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        int count = 0;
        int number;
        boolean isPrime;
        for (int i=0; i<total; i++) {
            number = sc.nextInt();
            if (number == 1) {
                continue;
            }
            isPrime = true;

            for (int j=2; j<=Math.sqrt(number); j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println(count);
    }
}