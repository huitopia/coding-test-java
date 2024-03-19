package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2,7,8,2,3,1};
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            boolean setResult = set.add(nums[i]);
            if(!setResult) {
                result.add(nums[i]);
            }
        }
        System.out.println("result = " + result);
    }
}
