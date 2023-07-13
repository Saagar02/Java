import java.io.*;
import java.util.*;
class pattern1{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows :");
		int row = sc.nextInt();
		System.out.print("Enter the no of col :");
		int col = sc.nextInt();
		for(int i=1;i<=row;i++){
			int temp = i;
			for(int j=1;j<=col;j++){
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}

}
