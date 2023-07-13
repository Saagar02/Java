class StringDemo{

	public static void main(String[] args){
	
		String str  = new String("Sagar");
		str.concat("Chaudhari");
		System.out.println(str);
	//	System.out.println(str.concat("Chaudhari"));

		StringBuffer sb = new StringBuffer("Sagar");
		sb.append("Chaudhari");
		System.out.println(sb);
	
	}

}
