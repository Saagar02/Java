import java.util.*;


interface parent {

	static void fun(){
		System.out.println("In fun ");
	}
	default void gun(){
		System.out.println("In gun ");
	}

}
interface parent2{

	static void fun(){
		System.out.println("In fun");
	}
	default void nun(){
		System.out.println("In gun ");
	}

}
class DemoChild implements parent,parent2{
	
	static void fun(){
		System.out.println("In child fun");
	}
	parent2.fun();	
}

class Client {

	public static void main(String[] args){
		
		DemoChild obj = new DemoChild();
		obj.fun();
		obj.gun();
	}

}
