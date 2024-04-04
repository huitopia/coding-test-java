package programmers.introduction;


public class 숫자_찾기 {
    public static void main(String[] args) {
        int num = 232443;
        int k = 4;
        int answer = -1; // num 의 k 값 index 3 i + 1 없으면 -1
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            if(Integer.toString(k).charAt(0) == str.charAt(i)) {
                    answer = i + 1;
                    break;
            }
        }
        System.out.println("answer = " + answer);

    }
}
