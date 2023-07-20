import java.util.*;
import java.io.*;

class Test{

	static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static void m1() throws  IOException {
		
		br.close();
		br.readLine();
	
	}
	static void m2(){
	
		System.out.println("In m2()");
	}

	public static void main(String[] args) throws IOException{
		m1();
		m2();
	}

}
