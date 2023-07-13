class Outer{

	static class Inner{
	
		public static void main(String[] args){
			System.out.println("in inner nested static class - main method");
		}

	}

	public static void main(String[] args){
		System.out.println("In outer class main method");
	}

}
