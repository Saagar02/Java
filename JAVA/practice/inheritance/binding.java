class Parent{

	static int a =10;
	int b = 20;

	static {
		System.out.println("In parent S-block");
	}

	Parent(){
		System.out.println("In parent constructor");
	}

	void m1(){
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}

}
class Child1 extends Parent{

	static int a = 30;
	int b = 40;

	static {
		System.out.println("In child1 S-block");
	}

	Child1(){
		System.out.println("In Child1 constructor");
	}

	void m1(){
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}

}
class Child2 extends Child1 {

	static int a = 50;
	int b = 60;

	static {
		System.out.println("In child2 S-block");
	}

	Child2(){
		System.out.println("In Child2 constructor");
	}

	void m1(){
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}

}

class Demo{

	public static void main(String[] args){
//		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
	//	Parent p = new Parent();
		c2.m1();
	}

}
