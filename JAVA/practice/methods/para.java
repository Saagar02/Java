class ParaDemo{
	void m1(int a , int b){
		System.out.println(a+b);
	
	}
	static void m2(){
	
		System.out.println("In m2");
	}
	public static void main(String[] args){
		ParaDemo obj = new ParaDemo();
		obj.m1(10,20);
		ParaDemo.m2();
		
	}

}
