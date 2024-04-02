package programmers.introduction;

public class 점의_위치_구하기 {
    public static void main(String[] args) {
        int[] dot = {2,4}; // x = 2, y =4
        // [+,+] = 1, [-,+] = 2, [-,-] = 3, [+,-] = 4
        int answer =
                (dot[0] > 0) && (dot[1] > 0) ? 1
                        :(dot[0] < 0) && (dot[1] > 0) ? 2
                :(dot[0] < 0) && (dot[1] < 0) ? 3 : 4;
        System.out.println("answer = " + answer);
    }
}
