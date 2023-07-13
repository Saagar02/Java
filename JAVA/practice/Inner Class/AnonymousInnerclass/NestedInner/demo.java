class Test{
	
	static class Nested{
		public void m1(){
			System.out.println("Static Nested Inner Class");
		}
	}

	public static void main(String[] args){
	
		Nested in = new Nested();
		in.m1();
	}
}
