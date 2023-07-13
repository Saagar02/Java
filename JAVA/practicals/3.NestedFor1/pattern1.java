import java.io.*;
import java.util.*;
class pattern1{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows :");
		int row = sc.nextInt();
		System.out.print("Enter the no of col :");
		int col = sc.nextInt();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("C2W ");
			}
			System.out.println();
		}
	}

}
