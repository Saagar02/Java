

//	Calculate Profit and Loss

class assign{
	
	public static void main(String[] args){
		
		int sp = 100, cp = 1000;

		if(sp > cp){
			
			System.out.println(" Profit is " + (sp - cp));
		}else if(sp < cp){
			
			System.out.println(" Loss is " + (cp - sp));
		}else{
		
			System.out.println(" No Profit No Loss ");
		}
	}
}
