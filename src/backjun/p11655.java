package backjun;

import java.util.Scanner;

public class p11655 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String N = scan.nextLine();

        char[] charArray = N.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {

            if (!Character.isLetter(c)) {
                sb.append(c);
                continue;
            }

            int asciiNum = (int) c + 13;

            if (Character.isUpperCase(c) && asciiNum > 90) {
                asciiNum = asciiNum - 26;
            } else if (Character.isLowerCase(c) && asciiNum > 122) {
                asciiNum = asciiNum - 26;
            }
            sb.append((char) asciiNum);
        }
        System.out.println(sb);
    }

}
