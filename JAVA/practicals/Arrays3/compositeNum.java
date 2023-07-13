import java.io.*;
import java.util.*;
class CompositeNumber{

	public static int[] compNum(int[] arr){
		System.out.println("In composiite number");
		int[] countArr = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int no = arr[i];
			for(int j=2;i<arr[i]/2;j++){
				if(no%j == 0){
					countArr[i] = -1;
				}
			}
		}
		return countArr;
	}
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of element :");
		int size =0;
		try{
			size = Integer.parseInt(br.readLine());
		}catch(IOException ioe){
		
		}
		int[] arr = new int[size];

		for(int i=0;i<arr.length;i++){	
			try{
				arr[i] = Integer.parseInt(br.readLine());
			}catch(IOException ioe){
		
			}
		}

		int[] countArr = compNum(arr);
		System.out.print("Composite numbers found at index numbers :");
		for(int i=0;i<countArr.length;i++){
			if(countArr[i]>-1){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}
