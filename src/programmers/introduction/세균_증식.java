package programmers.introduction;

public class 세균_증식 {
    public static void main(String[] args) {
        int n = 2;
        int t = 10;
        for (int i = 0; i < t; i++) {
            n = n * 2;
        }
        System.out.println("n = " + n);
    }
}
