
class assign{
	
	public static void main(String[] args){
		
		float sal = 5400.4f;

		if(sal > 100000){
			
			System.out.println("Satisfied");
		}else if(sal > 50000f){
			
			System.out.println("Just Some Improvement Required");
		}else if(sal > 20000f){
			
			System.out.println("More Improvement Required");
		}else if(sal > 10000f){
			
			System.out.println("Need lot's of Improvement");
		}else if(sal < 10000f && sal > 0f){
			
			System.out.println("Need lot's of improvement");
		}
		else{
			System.out.println("FUck You are unemployed");
		}
	}
}
