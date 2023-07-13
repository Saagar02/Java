class Parent{

	static void m1(){
		System.out.println("In Parent");
	}
}
class Child extends Parent{
	static void m1(){
		System.out.println("In Child");
	}
	public static void main(String[] args){
		Parent p1 = new Child();
		p1.m1();
	
	}

}
