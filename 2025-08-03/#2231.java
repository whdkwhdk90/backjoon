import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int value = 
        Integer.parseInt(str);
         
        int sum;
        int val;
        boolean isPresent = false;
        for (int i=value - (str.length() * 9); i<value; i++) {
            sum = 0;
            val = i;
            while (val != 0) {
                sum += val % 10;
                val /= 10;
            }
            
            if ((i + sum) == value) {
                System.out.println(i);
                isPresent = true;
                break;
            }
        }

        if (!isPresent) {
            System.out.println(0);
        }
    }
}