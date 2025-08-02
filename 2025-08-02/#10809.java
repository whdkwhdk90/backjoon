import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int a = 97;
        int z = 122;
        int index = 0;
        char ch;
        String answer = "";
        for (int i=a; i< z+1; i++) {
            ch = (char) i;
            index = str.indexOf(ch + "");
            if (index > -1) {
                answer += index;
            } else {
                answer += "-1";
            }
            answer += " ";
        }
        System.out.println(answer.strip());
    }
}