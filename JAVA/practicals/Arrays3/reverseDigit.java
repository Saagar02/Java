import java.io.*;
import java.util.*;
class revDigit{

	public static int[] reverseDigit(int[] arr){
		int[] countArr = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int no = arr[i];
			int rev = 0;
			while(no>0){
				rev = (rev*10 )+(no%10);
				no = no/10;
			}
			countArr[i]=rev;
		}
		return countArr;
	}
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of Array :");
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

		int[] countArr = reverseDigit(arr);
	/*	for(int a :countArr){
			System.out.print(a+" ");
		
		}*/
		System.out.println(Arrays.toString(countArr));
	}

}
