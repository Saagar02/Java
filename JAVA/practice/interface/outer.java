class Outer {

	int x =10;
	static int y =20;
	class Inner{
	
		void m1(){
			System.out.println(x);
			System.out.println(y);
		}
	}
}

class Client{

	public static void main(String []args){
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		in.m1();
	
	}
}
