class Outer{

	int x = 10;
	static int y = 20;

	static class Inner{
	
		void m1(){
		
//			System.out.println(x);		// Error : non-static access from static context
			System.out.println(y);
		}
	
	}

	public static void main(String[] args){
	
		Inner in = new Inner();
		in.m1();
	}

}
