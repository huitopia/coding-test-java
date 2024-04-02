package programmers.introduction;

import java.util.*;

public class 배열_뒤집기 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] resultArray = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            resultArray[num_list.length-1-i] = num_list[i];
        }
        System.out.println("resultArray = " + Arrays.toString(resultArray));
    }
}
