package leetcode;

import java.util.*;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int num : nums) {
            treeSet.add(num);
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(treeSet);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("list = " + list);
        if(list.size() > 2) {
            System.out.println("list.get(2) = " + list.get(2));
        } else {
            System.out.println("list.getLast() = " + list.getFirst());
        }

    }
}
