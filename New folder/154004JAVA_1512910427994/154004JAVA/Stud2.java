class Student{
int StuID;
String name;
double marks;

	Student(){
		StuID=154004;
		name="Amit";
		marks=82.7;
	}

	public void putData(){
		System.out.println("Student ID :"+StuID+"Student Name :"+name+"Marks :"+marks);
	}
}

public class Stud2{
	public static void main(String args[]){
		Student s1= new Student();
		s1.putData();
	}
}
