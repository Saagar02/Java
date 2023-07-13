class Demo{
	static void m3(){
	
	
	}
	void m2(){
	
		
	}
	void m1(){
	
		m2();
		m3();
	}
	public static void main(String[] args){
		Demo obj = new Demo();	
		obj.m1();	
		System.out.println(obj);
	}

}
