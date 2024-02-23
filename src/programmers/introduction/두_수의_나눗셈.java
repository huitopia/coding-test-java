package programmers.introduction;

public class 두_수의_나눗셈 {
    class Solution {
        public int solution(int num1, int num2) {
            double num3 = num1;
            double num4 = num2;
            double test = (num3 / num4) * 1000;
            int answer = (int) test;
            return answer;
        }
    }
}
