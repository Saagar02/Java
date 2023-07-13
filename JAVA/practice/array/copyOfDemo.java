import java.io.*;
class CopyOfDemo{

	public static void main(String[] args)throws IOException{
		int [] arr = new int[]{10,20,30,40,50};
		//java.util.Arrays.copyOf(int []arr, int 5);
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());	
		}*/
		int[] copy = java.util.Arrays.copyOf(arr,3);
		for(int i=0;i<copy.length;i++){
			System.out.println(copy[i]);
		}
	}

}
