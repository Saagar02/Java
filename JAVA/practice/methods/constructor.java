class Parent {
	Parent(){
		System.out.println("In parent Constructor");
	}
	static{
		System.out.println("In Parent Static Block");	
	}
}
class Child1 extends Parent{
	Child1(){
		System.out.println("In child1 Constructor");
	}
	static{
		System.out.println("In child1 Static Block");	
	}
}
class Child2 extends Parent{
	Child2(){
		System.out.println("In child2 Constructor");
	}
	static{
		System.out.println("In child2 Static Block");	
	}
}
class Child3 extends Parent{
	Child3(){
		System.out.println("In child3 Constructor");
	}
	static{
		System.out.println("In child3 Static Block");	
	}
}
class Demo{
	public static void main(String[] args){
		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		Child3 ch3 = new Child3();
	}

}
