import java.io.*;
import java.util.*;
class ThreadDemo extends Thread {
	public void fun() throws IOException,InterruptedException{
		System.out.println("In fun");
		System.out.println(Thread.currentThread().getName());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0 ; i<=10 ; i++){
		
			String str = br.readLine();
			System.out.println("in T1 = : "+str);
			Thread.sleep(2000);
		}
		//br.readLine();
		br.close();
	
	}
	public void gun() throws IOException,InterruptedException{
		System.out.println("In gun");
		System.out.println(Thread.currentThread().getName());
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0 ; i<=1 ; i++){
		
			String str = br1.readLine();
			System.out.println("in T2 = : "+str);
			Thread.sleep(1000);
		}
		//System.out.println("taking input of br1:"+br1.readLine());
		br1.close();
	}
	public void run(){

		System.out.println("In run method");
		System.out.println(Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("t1")){
		System.out.println("current "+Thread.currentThread().getName());
	 		try{
	 			fun();
	 		}catch(Exception ioe){
	 			System.out.println("in error t1");
	 			ioe.printStackTrace();
	 		}
		}
		if(Thread.currentThread().getName().equals("t2")){
		System.out.println("current "+Thread.currentThread().getName());
	 		try{
	 			gun();
	 		}catch(Exception ioe){
	 			System.out.println("in error t2");
	 	//		ioe.printStackTreace();
	 		}
		}
	}
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		ThreadDemo t1 = new ThreadDemo();
		t1.setName("t1");
		t1.start();
		ThreadDemo t2 = new ThreadDemo();
		t2.start();
		t2.setName("t2");

	}


}
