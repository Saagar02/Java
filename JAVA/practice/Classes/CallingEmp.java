class EmpInfo{

	public static void main(String[] args){
		Emp e1 = new Emp(1,"Sagar Chaudhari");
		Emp e2 = new Emp(2,"Amar Chaudhari");
		Emp e3 = new Emp(3,"Pratiksha Chaudhari");
		Emp e4 = new Emp(4,"Omkar Chaudhari");
		Emp e5 = new Emp(5,"Ayush Chaudhari");

		Emp[] e = new Emp[6];

		e[0]=e1;
		e[1]=e2;
//		e[2]=e3;
		e[3]=e4;
		e[4]=e5;

		for(Emp ee : e){
			try{
				System.out.println("Emp Id = "+ee.eId+"\t"+" Emp Name = "+ee.eName);
			}catch(NullPointerException npe){
			//	System.out.println("Null Pointer Exception Caught");
			}
		}
	
	}

}
