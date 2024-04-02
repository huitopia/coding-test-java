package programmers.introduction;

public class 피자_나눠_먹기_1 {
    public static void main(String[] args) {
        int n = 15;
        // pizza 7조각
        int answer = (n % 7) == 0 ? n / 7 : (n / 7)+1;
        System.out.println(answer);
    }
}
