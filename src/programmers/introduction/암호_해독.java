package programmers.introduction;

import java.util.Arrays;

public class 암호_해독 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String answer = "";
        for (int i = 1; i <= cipher.length(); i++) {
            if (i % code == 0) {
                answer += cipher.charAt(i-1);
            }
        }
        System.out.println("answer = " + answer);
    }
}
