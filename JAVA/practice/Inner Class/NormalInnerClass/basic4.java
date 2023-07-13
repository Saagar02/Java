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
}
class C {
	public static void main(String[] c){
		
	/*	String str = c.toString();
		System.out.println(str);	*/
		System.out.println(c[0]);
		System.out.println("In main class");
		new Outer().m2();
	}

}
