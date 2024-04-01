package leetcode.easy;

import java.util.*;

public class Divide_Array_Into_Equal_Pairs {

    public static void main(String[] args) {
        int[] nums = {9,4,18,3,2,6,18,15,7,15,6,4,15,14,7,4,15,4,3,17,9,13,13,12,2,14,12,17};
        System.out.println("nums.length = " + nums.length);
        int groupNum = nums.length / 2;
        System.out.println("groupNum = " + groupNum);
        // 중복 값 담기
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        // 중복 값 기준으로 group 묶기
        // group == groupNum 과 같다면 true, 아니면 false
    }
}
