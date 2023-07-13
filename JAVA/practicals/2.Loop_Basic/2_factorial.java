
/*	Prog : Write a Program to calculate factorial of  given number
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 6, prod = 1, prod1 = 1;

		while(n > 1){
			
			prod = prod * n;
			n--;
		}

		System.out.println(prod);
			
		for(int j = 1; j <= 6; j++){
			
			prod1 = prod1 * j;
		}
	
		System.out.println(prod1);
	}
}
