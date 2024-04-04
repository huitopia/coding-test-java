package programmers.introduction;
public class 외계행성의_나이 {
    public static void main(String[] args) {
        // - 97
        int age = 23;
        String answer = ""; // cd
        char[] c = String.valueOf(age).toCharArray();
        for (int i = 0; i < c.length; i++) {
            answer += (char) (Character.getNumericValue(c[i]) + 97);
        }
        System.out.println("answer = " + answer);
    }
}
