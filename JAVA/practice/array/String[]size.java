class StringSize{
	public static void main(String[] args){
	//	System.out.println(args.length);
		byte b = 20;
		short s = 10;
		char ch = 'A';
		int [] argst = new int[2147400000];
		int i =1;
		for(int aa:argst){
			System.out.println(aa+" "+i++);
		}
	
	}

}
