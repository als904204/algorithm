package backjun;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class p1874 {

    public static void main(String[] args) {
        // input 을 받는다
        // 8
        //4
        //3
        //6
        //8
        //7
        //5
        //2
        //1

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int[] arr = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0];

        StringBuilder sb = new StringBuilder();

        // arr[i] 번째의 수를 입력 받는다.
        // 만약 arr[i] 번째의 수가 max 보다 크다면,
        // max = arr[i], arr[i] 부터 max 까지 "+" 출력 후
        // 


        // 4를 입력받으면 Stack 에 1부터 4까지 ++ 4번 출력한다.
        // 4를 제거하고  - 을 출력한다.
        // 3 이들어온다.
        // max(4) 와 비교한다.
        // 3이 작다.
        // 4부터 3까지 - 출력 한다
        // 6 이 들어온다.
        // max(4) 와 비교 - > 6이 더 크다.
        // max(4) 부터 6까지 ++ 출력 한다.
        // max = 6이다.




    }

}
