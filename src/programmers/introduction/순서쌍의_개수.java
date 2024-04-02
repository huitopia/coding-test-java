package programmers.introduction;

public class 순서쌍의_개수 {
    public static void main(String[] args) {
        int n = 20;
        int answer = 0; // 6
        // n % i == 0
        // n / i = x
        // i,x => 총 수
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) {
                answer++;
            }
        }
        System.out.println("answer = " + answer);
    }
}
