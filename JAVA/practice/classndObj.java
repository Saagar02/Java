
//class is thing where you can save various type of data
//Let us consider the class India.
class India{
	
	//there are 28 states and 8 union territories
	//let us consider the Karnataka state
	String state = "Karnataka Elections 2023";
	
	//members of leg.assembly
	int MLAs = 224;
	
	//members of parliament
	int MPs = 28;

	//Election campaign is a major task performed by every political  party. 	
	void ElectionCampaign(){

		System.out.println("Everyone Wanted To Win");
		System.out.println("...But INC won the election with 135 majority.");
	
	}

}

class Client{
	
	public static void main(String[] args){
		
		India obj = new India();

		System.out.println(obj.state);
		obj.ElectionCampaign();
	}

}
