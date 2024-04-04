package programmers.introduction;

public class 합성수_찾기 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println("answer = " + answer);
    }
}
