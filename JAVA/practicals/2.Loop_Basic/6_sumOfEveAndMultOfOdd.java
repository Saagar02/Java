
/*	Prog : Write a Program to sum of all even numbers and multiplication of odd numbers from 1 to 10
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 10, sum1 = 0, prod1 = 0, sum2 = 0, prod2 = 0;

		while(n != 0){

			if(n % 2 == 0){
				
				sum1 = sum1 + n;
			}else{
				prod1 = prod1 * n;
			}

			n--;
		}

		System.out.println(sum1);

		System.out.println(prod1);
			

		for(int j = 1; j <= 10; j++){

			if(j % 2 == 0){
				
				sum2 = sum2 + j;
			}else{
				
				prod2 = prod2 * j;
			}
		}
	
		System.out.println(sum2);
		System.out.println(prod2);		
	}
}
