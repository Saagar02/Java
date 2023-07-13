class twoD4{

	public static void main(String[] args){
	
		int[][] arr = new int[2][];
		arr[0] = new int [2];
		arr[1] = new int [5];
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
		for(int i =0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			
			}
			System.out.println();
		}
	
	
	}


}
