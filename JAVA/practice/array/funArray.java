class Demo{
		static void fun(int arr[]){
			System.out.println(System.identityHashCode(arr[0]));
			System.out.println(System.identityHashCode(arr[1]));
			System.out.println(System.identityHashCode(arr[2]));
			
		}
	public static void main(String[] args){
		int arr[] = new int[]{100,150,200};
		
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		
		fun(arr);
	}

}
