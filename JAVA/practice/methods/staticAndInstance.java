class Test{
	void m1(){
		System.out.println("In m1-method");
	}
	static void m2(){	
		System.out.println("In m2-method");
	}
 	void m3(){
		m1();
		m2();
	}
	public static void  main(String[] args){
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
	}


}
