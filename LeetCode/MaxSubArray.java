import java.util.HashMap;

public class MaxSubArray {
    

    public static int find(int arr[],int k){

        HashMap <Integer, Integer> map = new HashMap<>();

        int sum = 0 ;
        int length = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            map.put(i,sum);

            int rem = arr[i]-k;
            if(map.containsValue(rem) && length < map.get(rem)-i){
                length = map.get(rem)-i;
            }
        }
        return length;
    }
    public static void main(String[] args){

        int arr[] = new int[]{1,2,3,1,1,1,1};
    }
}
