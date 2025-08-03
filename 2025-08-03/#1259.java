import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String str;
        boolean isSymmetry;
        while (true) {
            str = br.readLine();
            if (str.equals("0")){
                break;
            }

            isSymmetry = true;
            for (int i=0; i<str.length()/2; i++) {
                if (((int)str.charAt(i)) != ((int)str.charAt(str.length() - 1 - i))){
                    isSymmetry = false;
                    list.add("no");
                    break;
                }
            }

            if (isSymmetry){
                list.add("yes");
            }
        }

        for (String listStr : list) {
            System.out.println(listStr);
        }
    }
}