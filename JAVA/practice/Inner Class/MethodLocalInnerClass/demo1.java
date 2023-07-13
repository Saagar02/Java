class Outer{

	class Inner{
		void m2(){
			System.out.println("In m2");
		}
	}

	static void m1(){
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args){
		new Outer().m1();
	}
}
