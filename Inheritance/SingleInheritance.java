class Boy{
	String name;
	int age;
	void getdata(){
		name="Karan";
		age=21;
	}
	void display(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);

	}
}

class Student extends Boy{
	int roll,marks;
	void get(){
		roll=21;
		marks=90;
	}
	void put(){
		System.out.println("Roll:"+roll);
		System.out.println("marks:"+marks);
	}
}

class SingleInheritance{
	public static void main(String[] args) {
		Student s=new Student();
		s.getdata();
		s.display();
		s.get();
		s.put();
	}
}