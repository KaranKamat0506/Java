class Boy{
	public String name;
	public int age;
	public void getData(){
		name="Siddharth";
		age=18;
	}
	public void putData(){
		System.out.println("\nName :"+name+"Age :"+age);
	}
}

class Student extends Boy{
	private int stuID;
	private double marks;
	public void getData(){
		name="Amit";
		age=17;
		stuID=154004;
		marks=82.7;
	}
	public void display(){
		System.out.println("\nName :"+name+"Age :"+age+"\nStudent ID :"+stuID+"Marks :"+marks);
	}
}

public class ovrride8{
	public static void main(String arhs[]){
		Student s1=new Student();
		s1.getData();
		s1.display();
	}
}
