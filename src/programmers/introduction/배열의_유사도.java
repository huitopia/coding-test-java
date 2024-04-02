package programmers.introduction;

import java.util.ArrayList;
import java.util.List;

public class 배열의_유사도 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int answer = 0; // 2
        List<String> arr1 = new ArrayList<>(List.of(s1));
        List<String> arr2 = new ArrayList<>(List.of(s2));
        arr1.retainAll(arr2);
        answer = arr1.size();


    }
}
