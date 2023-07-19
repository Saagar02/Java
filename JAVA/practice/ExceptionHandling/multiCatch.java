import java.io.*;
class Test{

	public static void main(String[] args){
	
		try{
			int a = 10/0;
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(Exception e){
		
			System.out.println(e);
		}
	
	}


}
