package programmers.introduction;

public class 자릿수_더하기 {
    public static void main(String[] args) {
        int n = 1234;
        String str = String.valueOf(n);
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i)-'0';
        }
        System.out.println("answer = " + answer);

    }
}
