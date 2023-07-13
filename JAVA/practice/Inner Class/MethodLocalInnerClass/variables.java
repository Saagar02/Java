class Outer{

	int x = 10;
	static int y = 100;

	public static void m1(){
	
		int p = 20;
		final int q = 200;

		class Inner{
		
			public void m2(){
//				System.out.println(x);  // Error(Instance variable cannot be access from static method)
				System.out.println(y);
				System.out.println(p);
				System.out.println(q);
			}
		}
		new Inner().m2();

	}

	public static void main(String[] args){	
		new Outer().m1();
	}
}
