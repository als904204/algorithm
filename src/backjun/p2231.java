package backjun;

import java.util.Scanner;

/**
 * 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
 * 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
 * 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
 * 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다.
 * 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 *
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 *
 * 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 *
 * Sample Input 1
 * 216
 * Sample Output 1
 * 198
 */
public class p2231 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        /**
         * n = 216, 가장 큰 자릿수 = d,
         * n 에서 d * 9를 빼어 최소 생성자의 범위를 찾는다.
         * 찾은 범위부터 n까지 반복하여 생성자 찾기. 216 - (2 * 9) = 198
         * from 198 to 216
         */


        int result = 0;
        for (int i = 1; i < N; i++) {
            int sum = i;
            int temp = i;

            while (temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }

            if (sum == N) {
                result = i;
                break;
            }

        }

        System.out.println(result);
    }
}
