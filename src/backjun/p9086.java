package backjun;

import java.util.Scanner;

public class p9086 {

    public static void main(String[] args) {
        // 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            String str = sc.nextLine();
            if (str.length() == 1) {
                System.out.println(str + str);
            }else{
                char first = str.charAt(0);
                char last = str.charAt(str.length() - 1);
                System.out.println(String.valueOf(first) + last);
            }
        }
    }

}
