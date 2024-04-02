package programmers.introduction;

public class 모음_제거 {
    public static void main(String[] args) {
        String my_string = "nice to meet you";
        String answer = ""; // bs
        answer = my_string.replaceAll("[aeiou]","");
        System.out.println("answer = " + answer);
    }
}
