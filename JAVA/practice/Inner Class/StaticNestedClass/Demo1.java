class Outer{
	
	static class Inner{
	
		public void m1(){
			System.out.println("In static inner class");
		}
	}

	public static void main(String[] args){
	
		Inner in = new Inner();
		in.m1();
	}

}
