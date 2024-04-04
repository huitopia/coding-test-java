package programmers.introduction;

public class 삼육구게임 {
    public static void main(String[] args) {
        int order = 30;
        long answer = String.valueOf(order).replaceAll("0","")
                .chars()
                .filter(x -> x % 3 == 0)
                .count();
        System.out.println((int)answer);
    }
}
