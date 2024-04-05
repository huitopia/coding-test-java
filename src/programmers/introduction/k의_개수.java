package programmers.introduction;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class k의_개수 {
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        int answer = 0;
        String str = String.valueOf(k);
        long count = Arrays.stream(
                        IntStream.rangeClosed(i,j).toArray())
                .mapToObj(String::valueOf)
                .filter(x -> x.contains(str))
                .collect(Collectors.toList()).stream().map(x -> x.split(""))
                .flatMap(Arrays::stream)
                .filter(x -> x.contains(str))
                .count();
        answer = (int) count;
        System.out.println(answer);


//                        .mapToObj(x -> String.valueOf(x))
//                        .filter(x -> x.contains(String.valueOf(k)))
//                        .map(x -> x.split(""))
//                        .flatMap(Arrays::stream)
//                        .collect(Collectors.toList());
    }
}
