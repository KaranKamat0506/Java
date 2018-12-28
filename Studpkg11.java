import Boy.Boypkg;
class Student extends Boypkg{
	private int StuID;
	private double marks;
	public void getData(int id, double m){
		super.getData();
		StuID=id;
		marks=m;
	}
	public void display(){
		System.out.println("\nStudent ID :"+StuID+"Marks :"+marks);
	}
}

public class Studpkg11{
	public static void main(String args[]){
		Student s1=new Student();
		s1.getData(154004,82.7);
		s1.putData();
		s1.display();
	}
}
