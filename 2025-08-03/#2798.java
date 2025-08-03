import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] conditionArr = br.readLine().split(" ");
        int total = Integer.parseInt(conditionArr[0]);
        int maximum = Integer.parseInt(conditionArr[1]);

        List<Integer> cardList = new ArrayList<>();
        for (String str : br.readLine().split(" ")) {
            cardList.add(Integer.parseInt(str));
        }

        int aroundMax = 0;
        int newVal;
        for (int i=0; i<total-2;i++) {
            for (int j=i+1; j<total-1;j++) {
                for (int k=j+1; k<total;k++) {
                    newVal = cardList.get(i) + cardList.get(j) + cardList.get(k);
                    if (newVal > maximum) {
                        continue;
                    }

                    if (aroundMax < newVal) {
                        aroundMax = newVal;
                    }
                }
            }
        }

        System.out.println(aroundMax);
    }
}