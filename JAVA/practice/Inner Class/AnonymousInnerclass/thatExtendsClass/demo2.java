class Outer{

	class Inner{
		void m2(){	
			System.out.println("In Inner");
		}
	}

	public static void m1(){
	
		Inner i = new Inner();
	}
	public static void main(String[] args){
		m1();
	}

}
