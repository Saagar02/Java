class Parent{
	static void m1(){
		System.out.println("In prent m1");
	}

}
class Child extends Parent{

	static void m1(){
		System.out.println("In prent m1");	
	}
	public static void main(String[] args){
		Parent p = new Child();
		p.m1();	
	}

}
