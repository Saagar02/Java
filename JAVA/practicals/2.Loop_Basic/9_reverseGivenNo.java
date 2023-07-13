
/*	Prog : Write a Program to reverse the given number
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 123,temp = n, rem1, rev1 = 0, rem2, rev2 = 0;

		while(n != 0){
			
			rem1 = n % 10;
			rev1 = rem1 + rev1 * 10;
			n = n / 10;
		}

		System.out.println(rev1);

		for(int i = temp; i != 0; i = i / 10){
			
			rem2 = n % 10;
			rev2 = rem2 + rev2 * 10;
		}

		System.out.println(rev2);
		
	}
}
