package programmers.introduction;


public class 숫자_찾기 {
    public static void main(String[] args) {
        int num = 232443;
        int k = 4;
        String str = String.valueOf(num);
        int answer = str.contains(String.valueOf(k)) ? str.indexOf(String.valueOf(k)) + 1 : -1;
        System.out.println("answer = " + answer);

    }
}
