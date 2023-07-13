
/*	Prog : Write a Program to count odd digits of given number
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 6234, count1 = 0, count2 = 0, rem1, rem2;

		while(n != 0){
			
			rem1 = n % 10;

			if(rem1 % 2 == 1){
				count1++;
			}

			n = n / 10;
		}

		System.out.println(count1);
			
		for(int j = 6234; j != 0; j = j / 10){
			
			rem2 = j % 10;

			if(rem2 % 2 == 1){
				count2++;
			}
		}
	
		System.out.println(count2);
	}
}
