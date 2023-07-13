
/*	Prog : Write a Program to count digits of given number
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 6234, count1 = 0, count2 = 0;

		while(n != 0){
			
			count1++;
			n = n / 10;
		}

		System.out.println(count1);
			
		for(int j = 6234; j != 0; j = j / 10){
			
			count2++;
		}
	
		System.out.println(count2);
	}
}
