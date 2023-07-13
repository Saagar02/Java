class ObjCheck{
	static void fun(float[] arr1){
		System.out.println(arr1);
		System.out.println("arr[0] ID :"+ System.identityHashCode(arr1[0]));
		System.out.println("arr[1] ID :"+ System.identityHashCode(arr1[1]));
		System.out.println("arr[2] ID :"+ System.identityHashCode(arr1[2]));
	
		for(int i=0;i<arr1.length;i++){
			arr1[i] = 10  + arr1[i]; 
		}
		arr1[0] = 30f;
		arr1[1] = 40f;
		arr1[2] = 50f;

		System.out.println(arr1);
		System.out.println("arr[0] ID :"+ System.identityHashCode(arr1[0]));
		System.out.println("arr[1] ID :"+ System.identityHashCode(arr1[1]));
		System.out.println("arr[2] ID :"+ System.identityHashCode(arr1[2]));
	
	}
	public static void main(String [] args){
		
		float [] arr = {20f,30f,40f};

		System.out.println(arr);
		System.out.println("arr[0] ID :"+ System.identityHashCode(arr[0]));
		System.out.println("arr[1] ID :"+ System.identityHashCode(arr[1]));
		System.out.println("arr[2] ID :"+ System.identityHashCode(arr[2]));
		
		fun(arr);

		System.out.println(arr);
		System.out.println("arr[0] ID :"+ System.identityHashCode(arr[0]));
		System.out.println("arr[1] ID :"+ System.identityHashCode(arr[1]));
		System.out.println("arr[2] ID :"+ System.identityHashCode(arr[2]));
			
	}

}
