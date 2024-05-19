package backjun;

import java.util.Scanner;

public class p27866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = Integer.parseInt(sc.nextLine());
        if (1 > index || index > str.length()) {
            throw new IllegalArgumentException("index의 값은 1보다 크거나 " + str.length() + "보다 작아야 합니다");
        }
        char c = str.charAt(index - 1);
        System.out.println(c);
    }

}
