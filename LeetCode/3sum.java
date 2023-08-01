import java.util.*;

class solution{

    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> OuterList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        String val = "";
        int score = 0 ;
        int start = 0;
        int end = 0;

        while(end< nums.length){

            if(end<3){
                score = score + nums[end];
                val = val+end;
            }else{

                if(score == 0){
                    if(!map.containsKey(val)){
                        map.put(val,1);
                        int no = Integer.parseInt(val);
                        int a = no%10; no = no/10;
                        int b = no%10; no = no/10;
                        int c = no%10; no = no/10;
                        OuterList.add(Arrays.asList(a,b,c));
                    }
                }

                val = val.substring(1,val.length());
                val = val+end;
                score = score + nums[end] - nums[start-1];
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