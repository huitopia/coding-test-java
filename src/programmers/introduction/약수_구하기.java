package programmers.introduction;

import java.util.ArrayList;
import java.util.List;

public class 약수_구하기 {
    public static void main(String[] args) {
        int n = 29;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(n % (i+1) == 0) {
                list.add(i+1);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
