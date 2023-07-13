class Outer{

	public static void main(String[] args){
		Outer.Inner i = new Outer().new Inner();
		i.m1();
	}
	class Inner{
	
		void m1(){
			System.out.println("In inner m1");
		}
	}
}
