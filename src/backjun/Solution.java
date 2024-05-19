package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 1, 1, 3, 5};
        int[] solution = solution(arr);
        System.out.println(Arrays.toString(solution));
    }
    public static int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            result[i] = num_list[num_list.length - i - 1];
        }
        return result;
    }
}
