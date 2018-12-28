class Student{
int StuID;
String name;
double marks;

	public void getData(){
		StuID= 164021;
		name="KARAN";
		marks=85.23;
	}

	public void putData(){
		System.out.println("Student ID : "+StuID+" \n Student Name : "+name+" \n  Marks : "+marks);
	}
}

public class Stud1{
	public static void main(String args[]){
		Student s1= new Student();
		s1.getData();
		s1.putData();
	}
}
