package programmers.introduction;

public class 주사위의_개수 {
    public static void main(String[] args) {
        int[] box = {10, 8, 6};
        int n = 3;
        int answer = 0; //12
        answer =( box[0] / n )*( box[1] / n ) *( box[2] / n );
        System.out.println("answer = " + answer);
    }
}
