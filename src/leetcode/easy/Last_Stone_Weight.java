package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Last_Stone_Weight {
    public static  void main(String[] args) {
        int[] stones = {2,2};
        List<Integer> stoneList =new ArrayList<>(Arrays.stream(stones).boxed().toList());
        while (stoneList.size() > 1){
            stoneList.sort((a,b) -> b-a);
            int max1 = stoneList.remove(0);
            int max2 = stoneList.remove(0);
            int diff = max1 - max2;
            if (diff != 0){
                stoneList.add(diff);
            }
        }
        int result = 0;
        if(!stoneList.isEmpty()){
            result = stoneList.getFirst();
        }
        System.out.println("result = " + result);
    }
}
