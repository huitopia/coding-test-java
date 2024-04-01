package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    // int[] candies = [2,3,5,1,3] / int extraCandies = 3
    // 배열을 탐색해서 최고 값 찾기
    // 배열을 탐색해서 각 아이템과 extraCandies를 더한 값이
    // 위에서 찾은 최고값보다 크거나 같으면 true 아니면 false
    // List에 추가(add)
    // 완성된 List를 리턴

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1,3};
        int extraCandies = 3;
        // 결과 담을 배열 생성
        List<Boolean> result = new ArrayList<>();
        // 배열 최고 값 찾기
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i =0; i < candies.length; i++){
            // candies[i] + extraCandies의 값이 작으면 false 담기
            if((candies[i] + extraCandies) < max){
                result.add(false);
            }else { // 크면 true 담기
                result.add(true);
            }
        }

        System.out.println(result);
    }
}
