package programmers.introduction;

public class 양꼬치 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        // result = 124000
        int serviceCount = n / 10;
        int result = (12000*n) + (2000*(k - serviceCount));
        System.out.println("result = " + result);
    }
}
