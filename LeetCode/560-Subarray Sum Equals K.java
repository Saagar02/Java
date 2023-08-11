import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();

        int sum = 0 ;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            map.put(i,sum);

            if(sum == k){
                count++;
            }

            int rem = sum - k;

            if(map.containsValue(rem)){
                count++;
            }
        }
        return count;
    }
}