
/*	Prog : Write a Program to print a table of 2
*/

class assign{
	
	public static void main(String[] args){
		
		int n = 2;
		int i = 1;

		while(i < 11){
			
			System.out.println(n * i);
			i++;
		}

		for(int j = 1; j <= 10; j++){
			
			System.out.println(n * j);
		}
	}
}
