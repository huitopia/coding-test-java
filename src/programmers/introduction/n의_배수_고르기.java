package programmers.introduction;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class n의_배수_고르기 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        List<Integer> list = Arrays.stream(numlist)
                .filter(x -> x % n == 0)
                .boxed().collect(Collectors.toList());
        int[] answer = list.stream().mapToInt(x->x).toArray();
    }
}
