package leetcode.easy;

import java.util.*;

public class Minimum_Absolute_Difference {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        Arrays.sort(arr); // 정렬
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {;
            min = Math.min(min, arr[i] - arr[i-1]);
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i-1] == min) {
                list.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        System.out.println("list = " + list);
    }
}
