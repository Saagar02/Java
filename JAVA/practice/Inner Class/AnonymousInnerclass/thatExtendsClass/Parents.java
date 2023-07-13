import java.util.*;
class Popcorn{

	public void taste(){
		System.out.println("Salty");
	}
}

class Test{

	public static void main(String[] args){
	
		Popcorn p = new Popcorn(); 			//Object is of class Popcorn
		p.taste();
		
		Popcorn p1 = new Popcorn(){			//Object is of class Test$1
			public void taste(){
				System.out.println("Spiecy");
			}
		};
		p1.taste();	
		Popcorn p2 = new Popcorn(){			//Object is of class Test$2
			public void taste(){
				System.out.println("Sweet");
			}
		};
		p2.taste();
		System.out.println(p.getClass().getName());
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
	}
}
