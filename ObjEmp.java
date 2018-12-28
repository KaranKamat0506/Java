class Employee{
	int empno;
	String name;

	void getdata(int no,String n){
		empno=no;
		name=n;
	}

	void putdata(){
		System.out.println("Empno=" + empno);
		System.out.println("Name=" + name);
	}
}

class ObjEmp{
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getdata(20,"Karan");
		e1.putdata();
	}
}