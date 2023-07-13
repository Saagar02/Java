class Calljava{
	static int x = 1;
	public static void main(String [] args){
		String [] s = {"Sagar","Aditya"};
		System.out.println("In Main = "+x++);
		main(s);
		System.out.println("In Main");
	}
}
