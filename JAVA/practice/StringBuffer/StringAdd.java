class Demo{

	public static void main(String[] args){
		StringBuffer str1 = new StringBuffer("Hey");
		System.out.println(str1.capacity());
		System.out.println(System.identityHashCode(str1));
		str1.append("how you doin ? My name is joey ? So tell me the new chad");
		System.out.println(str1.capacity());
		System.out.println(System.identityHashCode(str1));
	
	}

}
