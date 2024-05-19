package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class p1037 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(numbers[0]*numbers[num - 1]);

    }

}

