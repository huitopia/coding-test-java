package programmers.introduction;

public class 피자_나눠_먹기_3 {
    public static void main(String[] args) {
        int slice = 7;
        int n = 10;
        int answer = 0; // 2
        if(n%slice == 0) {
            answer = n/slice;
        } else {
            answer = 1 + (n/slice);
        }
        System.out.println("answer = " + answer);
    }
}
