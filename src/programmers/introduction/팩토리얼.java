package programmers.introduction;

public class 팩토리얼 {
    public static void main(String[] args) {
        int n = 3628800;
        int answer = 1;
        int count =1;
        while (true){
            count *= answer;
            if(n < count){
                answer--;
                break;
            } else if(n == count){
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
