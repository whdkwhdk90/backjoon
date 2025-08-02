import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long participants = sc.nextLong();
        long[] longArr = new long[6];
        for (int i=0; i<longArr.length; i++) {
            longArr[i] = sc.nextLong();
        }

        long tBundle = sc.nextLong();
        long pBundle = sc.nextLong();
        long each = 0;
        for (int i=0; i<longArr.length; i++) {
            each += longArr[i] % tBundle == 0 ? longArr[i] / tBundle : (longArr[i] / tBundle) + 1;
        }
        System.out.println(each + "");
        System.out.println((participants / pBundle) + " " + (participants % pBundle));
    }
}