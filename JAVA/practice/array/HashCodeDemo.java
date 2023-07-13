import java.io.*;
class HashDemo{

	public static void main(String[] args)throws IOException{
		int [] arr = new int[]{10,20,30,40,50};
		int [] arr1 = arr;
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());	
		}*/
		if(java.util.Arrays.hashCode(arr) == java.util.Arrays.hashCode(arr1)){
			System.out.println("Equal Arrays");
		}
		System.out.println(java.util.Arrays.hashCode(arr));
	}

}
