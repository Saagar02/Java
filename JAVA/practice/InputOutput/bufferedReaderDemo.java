import java.io.*;

class BuffReder {
	public static void main(String [] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number of rows ");
		int row = Integer.parseInt(br.readLine());
	//	System.out.println(row);

		for(int i =1;i<=row;i++){		//row = i
			int no1=1;int no2=4;
			char ch1='A';char ch2='D';
			for(int j=1;j<=4;j++){ 		//col = j
				if(i%2==0){
					System.out.print(ch1);
					System.out.print(no1+" ");
				}else{
					System.out.print(ch2);
					System.out.print(no2+" ");
				}
				ch1++;no1++;
				ch2--;no2--;
			}
			System.out.println();
		
		}

	}

}


