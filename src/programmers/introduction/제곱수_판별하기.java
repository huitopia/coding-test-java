package programmers.introduction;

public class 제곱수_판별하기 {
    public static void main(String[] args) {
        int n = 144;
        int answer =Math.sqrt(n) % 1 == 0 ? 1 : 2;
        System.out.println("answer = " + answer);
    }
}
