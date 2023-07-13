class ArrayDemo{

	public static void main(String[] args){
		int [] arr = {5,4,9,6,7,3,6,5,2};
		System.out.print("First Array before sorting :");
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();
		java.util.Arrays.sort(arr);
		System.out.print("First Array After sorting :");
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();
		java.util.Arrays.fill(arr,1,5,10);
		System.out.print("First Array after fill :");
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();
		int x = java.util.Arrays.binarySearch(arr,0);
		System.out.println("Element found ar index no :"+x);
		int [] arr1={};
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.arraycopy(arr,0,arr1,0,9);
		System.out.print("Second Array before sorting :");
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();
		java.util.Arrays.parallelSort(arr1);
		System.out.print("Second Array After sorting :");
		for(int a:arr){
			System.out.print(a+" ");
		}


	
	}	


}
