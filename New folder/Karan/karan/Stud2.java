class Student{
int StuID;
String name;
double marks;

	Student(){
		StuID=164021;
		name="Karan";
		marks=79.5;
	}

	public void putData(){
		System.out.println("Student ID :"+StuID+"\n Student Name :"+name+"\nMarks :"+marks);
	}
}

public class Stud2{
	public static void main(String args[]){
		Student s1= new Student();
		s1.putData();
	}
}
