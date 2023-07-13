
/*	Prog : Write a Program to square of even digits of given number
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 6234, rem1, rem2;

		while(n != 0){
			
			rem1 = n % 10;

			if(rem1 % 2 == 0){
				
				System.out.println(rem1 * rem1);
			}

			n = n / 10;
		}

			
		for(int j = 6234; j != 0; j = j / 10){
			
			rem2 = j % 10;

			if(rem2 % 2 == 0){
				
				System.out.println(rem2 * rem2);
			}
		}
	}
}
