package programmers.introduction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 진료_순서_정하기 {
    public static void main(String[] args) {
        int[] emergency = {3,76,24}; // 환자의 응급도
        int[] answer = new int[emergency.length]; // 3,1,2
        List<Integer> list = Arrays.stream(emergency).sorted()
                .boxed().collect(Collectors.toList());
        Collections.reverse(list);
        // int 배열의 i번째 값이 list j와 값이 같다면
        // answer[i] = [j]
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(emergency[i] == list.get(j)) {
                    answer[i] = j+1;
                }
            }
        }
        System.out.println(Arrays.toString(answer));

    }
}
