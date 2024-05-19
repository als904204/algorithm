package backjun;

import java.util.Scanner;

public class p10820 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            int low = 0;
            int up = 0;
            int dig = 0;
            int space = 0;
            char[] charArray = line.toCharArray();
            for (char c : charArray) {
                if (Character.isLowerCase(c)) {
                    low++;
                } else if (Character.isUpperCase(c)) {
                    up++;
                } else if (Character.isDigit(c)) {
                    dig++;
                } else if (Character.isWhitespace(c)) {
                    space++;
                }
            }
            System.out.println(low + " " + up + " " + dig + " " + space);
        }
        scan.close();
    }

}
