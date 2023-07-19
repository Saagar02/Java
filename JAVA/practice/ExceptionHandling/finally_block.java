class Test{
	public static void main(String[] args){
		int a = 0;
		try{
			 a = 10/1;
		}catch(Exception e){
	
			a = 10/2;
		}finally{
	
			System.out.println("In finally with a = "+a);
		}
	}


}
