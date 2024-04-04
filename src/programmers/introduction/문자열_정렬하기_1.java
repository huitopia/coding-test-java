package programmers.introduction;

import java.util.Arrays;

public class 문자열_정렬하기_1 {
    public static void main(String[] args) {
        String my_String = "hi12392";
//        int[] answer = {};
        // 숫자만 골라 오름차순 정렬
        String num = my_String.replaceAll("[a-z]", "");
        char [] c = num.toCharArray();
        Arrays.sort(c);
        int[] answer = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            answer[i] = Character.getNumericValue(c[i]);
        }
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
