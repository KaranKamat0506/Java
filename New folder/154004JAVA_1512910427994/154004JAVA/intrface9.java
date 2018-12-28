interface Methods{
	public void getData();
	public void putData();
}

class Student implements Methods{
	private int stuID;
	private String name;
	private double marks;
	public void getData(){
		stuID=154004;
		name="Amit";
		marks=82.7;
	}  
	public void putData(){
		System.out.println("\nStudent ID :"+stuID+"Student Name :"+name+"Marks :"+marks);
	}
}

public class intrface9{
	public static void main(String args[]){
		Student s1=new Student();
		s1.getData();
		s1.putData();
	}
}
