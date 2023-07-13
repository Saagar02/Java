
/*	Prog : Write a Program to check whether the number is palindrome or not
 *	
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 121, temp = n, rem, rev = 0;

		while(n != 0){
			
			rem = n % 10;
			rev = rem + rev * 10;
			n = n / 10;
		}

		System.out.println(rev);

		if(temp == rev){
			
			System.out.println("Palindrome");
		}else{
			
			System.out.println("Not Palindrome");
		}

/*		for(int i = temp; i != 0; i = i / 10){
			
			rem2 = n % 10;
			rev2 = rem2 + rev2 * 10;
		}

		System.out.println(rev2);
*/		
	}
}
