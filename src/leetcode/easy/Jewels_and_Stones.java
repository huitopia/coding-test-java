package leetcode.easy;

import java.util.Objects;

public class Jewels_and_Stones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        boolean bool;
        char c = ' ';
        String str = "";
        int cnt = 0;
        for (int i = 0; i < stones.length(); i++) {
            c = stones.charAt(i);
            str = Character.toString(c);
            bool = jewels.contains(str);
            if(bool) {
                cnt++;
            }
        }
        System.out.println("cnt = " + cnt);
    }
}
