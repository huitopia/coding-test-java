package programmers.introduction;

public class 옷_가게_할인_받기 {
    public static void main(String[] args) {
        int price = 150000;
        int answer = 0; // 142500
        // 10만원 > 5%, 30만원 > 10%, 50만원 > 20%
        if(500000 <= price) {
            answer = (int) (price*0.8);
        }
        else if(300000 <= price) {
            answer = (int) (price*0.9);
        }
        else if(100000 <= price) {
            answer = (int) (price*0.95);
        } else {
            answer = price;
        }
    }
}
