class EmpInfo{

	public static void main(String[] args){
		Emp e1 = new Emp(1,"Sagar Chaudhari");
		Emp e2 = new Emp(2,"Amar Chaudhari");
		Emp e3 = new Emp(3,"Pratiksha Chaudhari");

		Emp[] e = new Emp[5];

		e[0]=e1;
		e[2]=e2;
		e[3]=e3;
		for(Emp ee : e){
			System.out.println("Emp Id = "+ee.eId+"\t"+" Emp Name = "+ee.eName);
		}
	
	}

}
