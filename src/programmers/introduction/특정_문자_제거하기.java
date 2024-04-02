package programmers.introduction;

public class 특정_문자_제거하기 {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        // result "abcde
        String result = my_string.replace(letter,"");
        System.out.println("result = " + result);
    }
}
