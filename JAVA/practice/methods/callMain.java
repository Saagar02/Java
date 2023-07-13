
class JoinDemo extends Thread{

	static Thread x = null;
	public void run(){
		try{
			System.out.println(x.getName());
			x.join();
		}catch(InterruptedException ie){
			
		}
		for(int i =0;i<10;i++){
			System.out.println("In run Method");
		}
	}
}

class Demo{

	public static void  main(String[] args) throws Exception{
		JoinDemo.x = Thread.currentThread();
		JoinDemo obj = new JoinDemo();
//		obj.join();
		obj.start();
		for(int i =0;i<10;i++){
			System.out.println("In main Method");
		}
	
	}

}
