class Outer{

	class Inner{
	
		public void m1(){
		
			System.out.println("InnerClass m1()");
		}

	}
	public void m2(){
		System.out.println("In m2 method");
		new Inner().m1();
	}
	public static void main(String[] args){
		System.out.println("In main method");
		new Outer().m2();
	}

}
