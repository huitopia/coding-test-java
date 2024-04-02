package programmers.introduction;

public class 배열의_평균값 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         // 5.5
        double result = 0;
        for(int i : numbers) {
            result += i;
        }
        result = result/numbers.length;
        System.out.println("result = " + result);
    }
}
