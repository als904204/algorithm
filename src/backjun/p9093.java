package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class p9093 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }


        for (String target : strings) {
            String[] words = target.split(" ");
            for (String word : words) {
                StringBuilder sb = new StringBuilder();
                for (int j = word.length() - 1; j >= 0; j--) {
                    sb.append(word.charAt(j));
                }
                System.out.print(sb.append(" "));
            }
            System.out.println();
        }


    }
}
