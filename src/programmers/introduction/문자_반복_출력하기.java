package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자_반복_출력하기 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        // hhheeellllllooo
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        System.out.println("answer = " + answer);

    }
}
