package leetcode.easy;

import java.util.*;

public class Number_of_Students_Unable_to_Eat_Lunch {
    public static void main(String[] args) {
//        int[] students = {1,1,0,0};
//        int[] sandwiches = {0,1,0,1};
//        int[] students = {1,1,1,0,0,1};
//        int[] sandwiches = {1,0,0,0,1,1};
        int[] students= {0,0,1,1,0,0,0,0,1,0,0,1,1,0,1,1};
        int[] sandwiches ={1,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0};

        /*
         *  start 1100 / 0101
         *  false 1001 / 0101
         *  false 0011 / 0101
         *  true  x011 / x101
         *  false 110 / 101
         *  true x10 / x01
         *  false 01 / 01
         *  true x1 / x1
         *  true x / x
         *
         *  students[0]과 sandwiches[0]이 일치하면 true .poll
         *  불일치하면 students[0]의 요소를 뒤로 보냄 .poll > .offer
         * */
        // https://github.com/sebaek/java20240219/commit/2444e4aac4fdd01069cef0f8a4a336dc4efa44a9?diff=unified&w=0
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int s1 : students){
            q1.offer(s1);
        }
        for(int s2 : sandwiches){
            q2.offer(s2);
        }

        int remain = q1.size();
        while(!q1.isEmpty() && remain > 0){
            int student = q1.peek();
            int sandwich = q2.peek();

            if(student == sandwich) {
                q1.poll();
                q2.poll();

                remain = q1.size();
            } else {
                remain--;
                int s = q1.poll();
                q1.offer(s);
            }
        }
        System.out.println("q1 = " + q1.size());
    }
}
