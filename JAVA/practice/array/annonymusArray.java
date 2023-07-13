

class Demo{
	public static void sum(int[] x){
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	
	}
	public static void main(String[] args){
		int x =0;
		int y =1;
		int z =2;	
		sum(new int[]{x,y,z});	//Passing Annonymus Array 
	
	}


}
