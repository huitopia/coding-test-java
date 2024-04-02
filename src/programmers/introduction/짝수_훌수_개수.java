package programmers.introduction;

import java.util.Arrays;

public class 짝수_훌수_개수 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};

        int[] answer = new int[2]; // 2,3
        long j = Arrays.stream(num_list)
                .filter(x->x%2 == 0)
                .count();
        answer[0] = (int) j;
        answer[1] = num_list.length - (int)j;
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
