class Test{

	public static void main(String[] args){
	
		try{
		
			int a = 10/0;
		}catch(Exception e){

			System.out.println("In catch 1");

		}catch(ArithmeticException e){

			System.out.println("In catch 1");

		}
	}

}
