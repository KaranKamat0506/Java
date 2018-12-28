class Student{
int StuID;
String name;
double marks;

	Student(){
		StuID=154004;
		name="Amit";
		marks=82.7;
	}

	Student(int id, String n, double m){
		StuID=id;
		name=n;
		marks=m;
	}

	public void putData(){
		System.out.println("Student ID :"+StuID+"Student Name :"+name+"Marks :"+marks);
	}
}

public class Stud3{
	public static void main(String args[]){
		Student s1= new Student();
		Student s2= new Student(154001,"Vivek",80.4);		
		s1.putData();
		s2.putData();
	}
}
