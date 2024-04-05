package programmers.introduction;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 모스부호_1 {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        List<String> list = Arrays.stream(letter.split(" ")).collect(Collectors.toList());
        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            int indexOf = Arrays.asList(m).indexOf(list.get(i));
            answer += Character.toString(indexOf+97);
        }
        System.out.println("answer = " + answer);
    }
}
