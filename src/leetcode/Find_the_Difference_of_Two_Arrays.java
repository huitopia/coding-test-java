package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class Find_the_Difference_of_Two_Arrays {
    public static void main(String[] args) {
//        int[] nums1 = {1,2,3};
//        int[] nums2 = {2,4,6};
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        // [[1,3],[4,6]]
        List<Integer> dellist1 = new ArrayList<>();
        List<Integer> dellist2 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        List<Integer> sublist1 = new ArrayList<>();
        List<Integer> sublist2 = new ArrayList<>();

        for(int num : nums1) {
            dellist1.add(num);
        }
        for(int num : nums2) {
            dellist2.add(num);
        }

        sublist1.addAll(dellist1);
        sublist2.addAll(dellist2);

        dellist1.retainAll(dellist2);
        dellist2.retainAll(dellist1);

        for(int i = 0; i < dellist1.size(); i++) {
            sublist1.remove(Integer.valueOf(dellist1.get(i)));
        }
        for(int i = 0; i < dellist2.size(); i++) {
            sublist2.remove(Integer.valueOf(dellist2.get(i)));
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.addAll(sublist1);
        set2.addAll(sublist2);
        List<Integer> list1 = list.get(0);
        List<Integer> list2 = list.get(1);
        list1.addAll(set1);
        list2.addAll(set2);
        System.out.println(list);
    }
}
