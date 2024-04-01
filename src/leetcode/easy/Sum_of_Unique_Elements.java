package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Sum_of_Unique_Elements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n : nums) {
            boolean bool = set1.add(n);
            if(!bool) {
                set2.add(n);
            }
        }
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        for(int n : set2) {
            set1.remove(n);
        }
        System.out.println("set1 = " + set1);

        Integer result = set1.stream().reduce(0, (a, b) -> a + b);
        System.out.println("result = " + result);

    }
}
