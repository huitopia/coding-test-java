package programmers.introduction;

import java.util.Arrays;

public class 대문자와_소문자 {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            } else{
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println("answer = " + answer);
    }
}
