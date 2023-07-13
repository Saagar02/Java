class Demo{

	public static void main(String [] args){
		Demo obj = new Demo();
		obj.fun(10);
		obj.fun(12.3f);
		obj.fun('A');
	}
	void fun(float x){
		System.out.println(x);
	
	}

}
