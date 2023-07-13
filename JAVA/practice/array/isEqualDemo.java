import java.io.*;
import java.util.*;
class isEqual{

	public static void main(String[] args)throws IOException{
	/*	int [] arr = new int[]{10,20,30,40,50};
		int [] arr1 = new int[]{60,70};*/
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());	
		}*/
		String arr = new String("Hello");
		String arr1 = new String("Hello");
		System.out.println(arr.equals(arr1));
		System.out.println(java.util.Arrays.equals(arr1,arr));
		System.out.println(java.util.Arrays.hashCode(arr1));
		System.out.println(java.util.Arrays.hashCode(arr));
		
	}

}
