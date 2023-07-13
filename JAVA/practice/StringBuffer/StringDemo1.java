class Demo1{

	public static void main(String[] args){
	
		StringBuffer sb =  new StringBuffer("Hi Sagar");

		System.out.println("identity HashCode = "+System.identityHashCode(sb));
		System.out.println("hashCode = "+sb.hashCode());

		StringBuffer sb1 =  new StringBuffer("Hi ledies and gents");

		System.out.println("identity HashCode = "+System.identityHashCode(sb1));
		System.out.println("hashCode = "+sb1.hashCode());
	
	}


}
