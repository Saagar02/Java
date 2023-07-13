import java.io.*;
import java.util.*;
class MultiThreading extends Thread{
	gun(){
		
		
	}
	public void run(){
		if(Thread.currentThread().getName().equals("t1")){
			gun();
		}
	}
	public static void  main(){
		MultiThreading t1 = new MultiThreading();
		t1.setName("t1");
		t1.start();
		
	}
	

}
