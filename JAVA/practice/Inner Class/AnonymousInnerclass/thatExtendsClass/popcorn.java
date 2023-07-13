class Popcorn{

	public void taste(){
		System.out.println("Salty");
	}
}

class Test{

	public static void main(String[] args){
	
		Popcorn p = new Popcorn();
		p.taste();	//Salty
	// But i dont want salty popcorn , i want spiecy 
	
		Popcorn p1 = new Popcorn(){	// Object of child class that does not have name , not Popcorn class.
			
			public void taste(){
				System.out.println("Spiecy");
			}
		};
		p1.taste();	//Spiecy
	// Here we are overriding the taste method of Popcorn class but for only one time use . 
	
	}
}
