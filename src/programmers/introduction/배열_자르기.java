package programmers.introduction;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_자르기 {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5};
        int num1=1;
        int num2=3;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList()).subList(num1,num2+1);
        int[] answer = list.stream().mapToInt(x ->x).toArray();
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
