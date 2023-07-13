class Outer{
	
	static void m1(){
		class Inner{
			void m2(){
				System.out.println("In m2 i");
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args){
			m1();
	}
}
