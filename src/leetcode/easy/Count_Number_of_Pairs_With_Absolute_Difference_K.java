package leetcode.easy;

public class Count_Number_of_Pairs_With_Absolute_Difference_K {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        int k = 2;
        // result = 4
        /*
        *  i < j
        *  0,1
        *  0,2
        *   0,3
        * */
        int cnt = 0;
        for(int i = 0; i < nums.length; i++ ){
            System.out.println("##### i = " + i);
            for(int j = i+1 ; j < nums.length; j ++) {
                System.out.println("j = " + j);
                if(nums[j]-nums[i] == k) {
                    cnt++;
                }
                if(nums[i]-nums[j] == k) {
                    cnt++;
                }
            }
        }
        System.out.println("cnt = " + cnt);
    }
}
