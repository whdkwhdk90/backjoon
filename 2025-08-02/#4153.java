import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long width;
        long height;
        long diagonal;
        long temp;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");

        while (true) {  
            width = sc.nextLong();
            if (width == 0) {
                break;
            }
            height = sc.nextLong();
            diagonal = sc.nextLong();
            temp = 0;
            
            if (width > diagonal) {
                temp = diagonal;
                diagonal = width;
                width = temp;
            }

            if (height > diagonal) {
                temp = diagonal;
                diagonal = height;
                height = temp;
            }

            if ((diagonal * diagonal) == (width * width) + (height * height)) {
                list.add("right");
            } else {
                list.add("wrong");
            }
        }
        
        for (String str : list) {
            System.out.println(str);
        }
    }
}