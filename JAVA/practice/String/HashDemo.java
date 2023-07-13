class Demo{

	public static void main(String[] args){
	
		/*String str1 = new String("Core2Web");
		String str2 = new String("Core2Web");
		String str3 = new String("Core2Web");

		String str4 = "Core2web";
		String str5 = "Core2web";

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
	
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));*/

		int x = 10;
		int y = 10;

		System.out.println(x.hashCode());
		System.out.println(System.identityHashCode(x));
		System.out.println(y.hashCode());
		System.out.println(System.identityHashCode(y));

		
		System.out.println(x.hashCode());
		System.out.println(System.identityHashCode(y));
		System.out.println(x.hashCode(x));
		System.out.println(System.identityHashCode(y));

	}


}
