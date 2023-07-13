
/*	Prog : Write a Program if number is even print that number in reverse order or if odd print that number in reverse order in differnce of 2
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 10;
			
		if(n % 2 == 0){

			while(n != 0){	
				
				System.out.println(n);
				n--;
			}
		}else{
			
			while(n != 0){
				System.out.println(n);
				n -= 2;
			}
		}
				

		if(n % 2 == 0){

			for(int j = n; j >= 1; j--){
				
				System.out.println(j);	
			}	
		}else{
			
			for(int i = n; i >= 1; i=i-2){
				
				System.out.println(i);
			}
		}
	}
}
