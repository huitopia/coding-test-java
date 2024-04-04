package programmers.introduction;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 중복된_문자_제거 {
    public static void main(String[] args) {
        String my_string = "people";
        String answer = ""; // peol
        String str = my_string.chars().mapToObj(Character::toString)
                        .distinct().collect(Collectors.joining());
        System.out.println("str = " + str);
    }
}
