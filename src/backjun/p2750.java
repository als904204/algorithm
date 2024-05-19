package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class p2750 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
           arr[i] = Integer.parseInt(scan.nextLine());
        }

        Arrays.sort(arr);
        for (int result : arr) {
            System.out.println(result);
        }

    }

}
