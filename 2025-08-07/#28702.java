import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        int stringCount = 0;
        for (int i=0; i<arr.length; i++) {
            arr[i] = br.readLine();
            if (isNumber(arr[i])) {
                // 15 배수 : FizzBuzz
                // 3의배수, 5의배수x : Fizz
                // 5의 배수, 3의배수x : Buzz
                // 둘다 아닌 경우 : i
            }
        }

        System.out.println();
    }

    private boolean isNumber (String number) {
        return !(number.equals("FizzBuzz") || number.equals("Fizz") || number.equals("Buzz"))
    }
}