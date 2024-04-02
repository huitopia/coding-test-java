package programmers.introduction;

public class 양꼬치 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        // result = 124000
        int drink = 2000;
        int food = 12000;
        int serviceCount = n / 10;
        int serviceDrinkPrice =serviceCount * drink;
        int sum =( n * food )+ (k * drink);
        System.out.println(sum - serviceDrinkPrice);
    }
}
