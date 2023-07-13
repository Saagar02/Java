class StringDemo{

	public static void main(String[] args){
		
		String str1 = "Core2Web";
		String str2 = new String("Core2Web");

		System.out.println(System.identityHashCode(str1));	// 1000
		System.out.println(System.identityHashCode(str2));	// 2000

		String str3 = "Core2Web";				// 1000
		String str4 = new String("Core2Web");			// 3000

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	
	}

}
