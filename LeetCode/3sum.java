import java.util.*;

class solution{

    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> OuterList = new ArrayList<>();
        Map<int[], Integer> map = new HashMap<>();
        int[] val = new int[3];
        int score = 0 ;
        int start = 0;
        int end = 0;

        while(end< nums.length){

            if(end<3){
                score = score + nums[end];
                val[end] = nums[end];
            }else{

                if(score == 0){
                    if(!map.containsKey(val)){
                        map.put(val,1);
                        OuterList.add(Arrays.asList(val[0],val[1],val[2]));
                    }
                }

                val[0] = val[1];
                val[1] = val[2];
                val[2] = nums[j];
                score = val[1] + val[2] +val[3];
                start++;
            }
            end++;
        }
        return OuterList;
    }


    public static void main(){

        int arr[] = new int[]{-1,0,1,2,-1,-4};
        int arr2[] = new int[]{0,1,1};

        

    }

}