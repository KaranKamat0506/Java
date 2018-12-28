class Boy{
	public String name;
	public int age;
	public void getData(){
		name="Amit";
		age=18;
	}
	public void putData(){
		System.out.println("\nName : "+name+"\n Age : "+age);
	}
}

class Student extends Boy{
	private int StuID;
	private double marks;
	public void getData(){
	super.getData();
		StuID=154004;
		marks=82.7;
	}
	public void put(){
		System.out.println("\nStudent ID : "+StuID+"\nMarks : "+marks);
	}
}

public class Single6{
	public static void main(String args[]){
		Student s1=new Student();
		s1.getData();
		s1.putData();
		s1.put();
	}
}
