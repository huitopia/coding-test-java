package programmers.introduction;

import java.util.stream.Collectors;


public class A로_B_만들기 {
    public static void main(String[] args) {
        String before = "ollhh";
        String after = "hello";
        int answer = 0; // false 0, true 1
        before = before.chars().sorted()
                .mapToObj(x -> Character.toString(x)).collect(Collectors.joining());
        after = after.chars().sorted()
                .mapToObj(x -> Character.toString(x)).collect(Collectors.joining());
        if(before.equals(after)){
            answer = 1;
        }
        System.out.println("answer = " + answer);


    }
}
