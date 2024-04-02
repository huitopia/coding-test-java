package programmers.introduction;

public class 숨어있는_숫자의_덧셈_1 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int answer = 0; // 10
        String str = my_string.replaceAll("[^0-9]","");
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) -'0';
        }
        System.out.println("answer = " + answer);
    }
}
