package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args) {
        /*
        * numRows =  5
        * 원소 5개
        * */

        int numRows = 5;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            // numRows 받은 만큼 배열 생성
            List<Integer> subList = new ArrayList<>();
            for(int j = 0; j <= i; j++ ){
                if(j ==0 || j == i) {
                    subList.add(1);
                } else {
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    int prev = list.get(i - 1).get(j-1);
                    int next = list.get(i -1).get(j);
                    int n = prev + next;
                    System.out.println("prev = " + prev);
                    System.out.println("next = " + next);
                    System.out.println("n = " + n);
                    subList.add(n);
                }
            }
            list.add(subList);
        }
        System.out.println("result = " + list);
    }
}
