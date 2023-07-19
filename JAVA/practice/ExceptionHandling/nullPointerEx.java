class Test{

	ArithmeticException ae ;


	public static void main(String[] args){
		
		Test obj = new Test();	
		throw obj.ae;				// Here the referance variable is null
	}
}
