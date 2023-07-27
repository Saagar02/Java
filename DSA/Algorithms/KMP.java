
import java.io.*;
class KMP{

	public static int  KMPAlgo(String text , String pattern){
	
		int N = text.length();
		int M = pattern.length();
		int[] lps = new int[M];

		fillLps(pattern,M,lps);
	
		int i = 0;
		int j = 0;
		int count = 0;
		while(i<N-M+1){
			
			if(text.charAt(i) == pattern.charAt(j)){
				
				i++;
				j++;
			}else{
			
				if(j!=0){
					j = lps[j-1];
				
				}else{
				
					i++;
				}
			}

			if(j == M){
				count++;	
				System.out.println("String found at index no :" + (i-j));
				j = lps[j-1];
			}
		}
		if(count>0){
			return count;
		}else{
			return -1;
		}
	}
	public static int[] fillLps(String pattern , int size , int[] lps){
	
		int i = 1;
		int j = 0;
		lps[0] = 0;
		while(i<size){
			
			if(pattern.charAt(i) == pattern.charAt(j)){
				lps[i] = j+1;
				j++;
				i++;
			}else{
			
				if(j != 0){
					j = lps[j-1];
				}else{
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;

	}

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter text String : ");
		String text = br.readLine();

		System.out.println("Enter pattern String : ");
		String pattern = br.readLine();
	
		int count = KMPAlgo(text,pattern);

		if(count>0){
			System.out.println(count +" pattern found");
		}else{
			System.out.println("No  pattern found");
		}
	}
}
