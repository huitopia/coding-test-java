package programmers.introduction;

public class 피자_나눠_먹기_2 {
    public static void main(String[] args) {
        int n = 10;
        // x * 6 / n = 0
        // (x * 6) % 10 = 0 // 5
        int answer = 1;
        while (true) {
            if((answer * 6) % n == 0 ) {
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
