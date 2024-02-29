package programmers.basic;

public class 부분_문자열_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        String answer = "";
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < my_string.length; i++) {
            for(int j = 0; j < parts[i].length; j++ ){
                if (j == 0) {
                    num1 = parts[i][j];
                } else {
                    num2 = 1 + parts[i][j];
                }
            }
            answer += my_string[i].substring(num1, num2);
        }
        System.out.println("answer = " + answer);
    }
}
