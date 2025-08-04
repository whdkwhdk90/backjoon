import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int big = a;
        int small = b;
        if (a < b) {
            big = b;
            small = a;
        }

        int temp;
        do {
            temp = big % small;
            big = small;
            small = temp;
        } while (small != 0);

        System.out.println(big);
        System.out.println(a * b / big);
    }
}