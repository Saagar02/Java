
/*	Check if 0 - 5 and prints its spelling, if the number is greater than 5 print the number is greater than 5
 *
 *	Input : num = 4		, num = 6
 *	Ouput : four		, number is greater than 5
*/	
	
class assign{
	
	public static void main(String[] args){
		
		int num = 6;

		if(num < 5 && num > 0){
			
			if(num == 1){
				System.out.println("One");
			}else if(num == 2){
	
				System.out.println("Two");			
			}else if(num == 3){
				
				System.out.println("Three");
			}else if(num == 4){

				System.out.println("Four");
			}else if(num == 5){
				System.out.println("Five");
			}
		}else if(num < 0){
				
			System.out.println(num + "is less than 0");
		}else{
			
			System.out.println(num + "is greater than 5");
		}
		
	}
}
