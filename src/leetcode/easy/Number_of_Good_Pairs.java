package leetcode.easy;
public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        // nums[i] == nums[j] 값이 같고
        // i < j 하면
        // list에 넣고 .size 뱉어라
        int cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
        }
        System.out.println("cnt = " + cnt);
    }
}
