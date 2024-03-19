package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_The_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if (!set.add(num)) {
                System.out.println("num = " + num);
            }
        }
    }
}
