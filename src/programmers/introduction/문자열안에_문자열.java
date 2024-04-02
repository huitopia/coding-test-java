package programmers.introduction;

public class 문자열안에_문자열 {
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CE";
        // O : 1, X : 2
        int answer = str1.contains(str2) ? 1 : 2;
    }
}
