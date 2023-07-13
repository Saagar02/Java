
class assign{
	
	public static void main(String[] args){
		
		int n1 = 3, n2 = 3, n3 = 2;

		if(n1 > n2 && n1 > n3){
			
			System.out.println(n1 + " is the maximum between " + n1  + "," + n2 + " and " + n3);

		}else if(n2 > n1 && n2 > n3){
			
			System.out.println(n2 + " is the maximum between " + n1  + "," + n2 + " and " + n3);

		}else if(n3 > n1 && n3 > n2){

			System.out.println(n3 + " is the maximum between " + n1  + "," + n2 + " and " + n3);

		}else if(n1 > n2 && n1 == n3){

			System.out.println(n1 + " is greater than " + n2 + " and equal to " + n3);

		}else if(n2 > n3 && n2 == n1){

			System.out.println(n2 + " is greater than " + n3 + " and equal to " + n1);

		}else if(n3 > n1 && n3 == n2){

			System.out.println(n3 + " is greater than " + n1 + " and equal to " + n2);

		}else{
			
			System.out.println("All numbers are equal");
		}
	}
}
