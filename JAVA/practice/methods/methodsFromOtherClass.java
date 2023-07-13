class Student{
	String m1(){
	//	System.out.println("In student m1()");
		String str = "Sagar";
		return str;
	}
}
class Teacher{
	static String m1(){
		String str = "Shashi";
		return str;
	}
}
class Marks{
	int m1(){
		int marks = 80;
		return marks;
	}
}
class Div{
	String m1(){
		String str = "A";
		return str;
	}
}
class Principle{
	void m1(Student s , Teacher t){
		System.out.println("In principle m1()");
		System.out.println("Student name is :" + s.m1());
		System.out.println("Class Teacher name is :" + t.m1());
		System.out.println("Class Teacher name is :" + Teacher.m1());
	}
	static void m2(Marks m , Div d){
		System.out.println("In principle m2()");
		System.out.println("Student's marks :" + m.m1());
		System.out.println("Student's Division is :" + d.m1());
	}
	public static void main(String[] args){
		Principle p = new Principle();
		p.m1(new Student(),new Teacher());
		Principle.m2(new Marks(), new Div());

	}
}

