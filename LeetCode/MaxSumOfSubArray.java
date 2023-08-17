import java.util.HashMap;

class Solution {
    public int maxSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum = sum +nums[i];
            if(sum>maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}