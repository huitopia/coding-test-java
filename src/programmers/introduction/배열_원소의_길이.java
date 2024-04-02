package programmers.introduction;

import java.util.Arrays;

public class 배열_원소의_길이 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        // int[] result = [2,3,3,6]
        int[] result = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            result[i] = strlist[i].length();
        }
        System.out.println("result = " + Arrays.toString(result));
    }
}
