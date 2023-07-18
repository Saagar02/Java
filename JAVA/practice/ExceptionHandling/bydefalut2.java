import java.util.*;
import java.io.*;
import java.lang.*;
class Test{

	public static void main(String[] args){
	
		doStuff();
	}

	public static void doStuff() throws IOException{
	
		doMoreStuff();
	}

	public static void doMoreStuff(){
	
		System.out.println(10/0);
	}

}
