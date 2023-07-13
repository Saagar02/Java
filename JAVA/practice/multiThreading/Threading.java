import java.util.*;

class ThreadDemo extends Thread{
	public void gun(){
		System.out.println("In gun function : "+Thread.currentThread().getName());
	}
	public void fun(){
		System.out.println("In fun function : "+Thread.currentThread().getName());
	}
	public void run(){
		if(Thread.currentThread().getName().equals("Thread1")){
			fun();
		}
		if(Thread.currentThread().getName().equals("Thread2")){
			gun();
		}
	}
	public static void main(String[] args){
		ThreadDemo t1 = new ThreadDemo();
		t1.setName("Thread1");
		t1.start();

		ThreadDemo t2 = new ThreadDemo();
		t2.setName("Thread2");
		t2.start();
	}

}
