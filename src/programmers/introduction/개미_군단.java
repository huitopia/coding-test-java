package programmers.introduction;

public class 개미_군단 {
    public static void main(String[] args) {
        int hp = 24;
        int answer = 0; // 5
        // 장군 : 5, 병정 : 3, 일 : 1
        // 최소한의 병력 구하기
        // hp가 5보다 크면
        // 5의 몫을 answer 에 더하고
        // 5의 나머지를 hp로 만든다.
        // ph가 0 이면 종료되고 아니면 다음으로 넘어간다.
        boolean bool = true;
        while (bool){
            if (hp >= 5) {
                answer += hp / 5;
                hp = hp % 5;
            } else if( hp >= 3) {
                answer += hp / 3;
                hp = hp % 3;
            } else {
                answer += hp;
                hp = 0;
            }
            if (hp == 0) {
                bool = false;
            }
        }
        System.out.println("answer = " + answer);
    }
}
