package leetcode;

import java.util.*;


public class Two_Out_of_Three {
//        두 개 이상의 배열에 있는 값
    public static void main(String[] args) {
        int[] nums1 = {1,2,2};
        int[] nums2 = {4,3,3};
        int[] nums3 = {5};
        // [3,2]
        // set1에 1을 담고 2,3 을 담았을 때 false
        // set2에 2를 담고 3을 담았을 때 false
//        List<Integer> list1 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        boolean bool;
        for(int i : nums1) {
            set1.add(i);
        }
        for(int i : nums2) {
            set2.add(i);
        }
        for(int i : nums3) {
            set3.add(i);
        }
        for(int i : set2) {
            bool = set1.add(i);
            if(!bool){
                set.add(i);
            }
        }
        for(int i : set3) {
            bool = set1.add(i);
            if(!bool){
                set.add(i);
            }
        }
        for(int i : set3){
            bool = set2.add(i);
            if(!bool) {
                set.add(i);
            }
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(set);
        System.out.println("list = " + list);
    }
}
