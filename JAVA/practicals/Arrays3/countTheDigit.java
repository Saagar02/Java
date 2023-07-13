import java.io.*;
import java.util.*;
class DigitCount{

	public static int[] countDigit(int[] arr){
		int[] countArr = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int no = arr[i];
			int count =0;
			while(no>=0){
				if(no%10 == 0){
					count++;
				}else{
					System.out.print("In DigitCount ");
					count++;
					no = no/10;
				}
			}
			countArr[i]=count;
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

		int[] countArr = countDigit(arr);
	/*	for(int a :countArr){
			System.out.print(a+" ");
		
		}*/
		System.out.println(Arrays.toString(countArr));
	}

}
