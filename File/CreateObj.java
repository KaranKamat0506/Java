class Student{
	
	int roll;
	String name;
	void getdata(){
		roll=21;
		name="KARAN";
	}
	
	void putdata(){
		System.out.println("Roll no = " + roll);
		System.out.println("Name = " + name);
	}

	
}

class CreateObj{
	
	public static void main(String args[]){
		Student s1=new Student();
		s1.getdata();
		s1.putdata();
	}	
}