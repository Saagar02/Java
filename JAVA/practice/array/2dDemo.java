class twoD{

	public static void main(String[] args){
	
		int[][] arr = new int [2][];
		arr[0] = new int [2];
		arr[1] = new int [3];
		
		for(int[] a: arr){
			System.out.println(a);
		}
	/*	for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/	
		for(int[] a: arr){
			for(int b : a){
				System.out.print(b);	
			}
			System.out.println(a);
		}
	
	}



}
