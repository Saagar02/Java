
/*	Prog : Write a Program to print countdown of days to submit the assignment
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 10;
			
		
				

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
