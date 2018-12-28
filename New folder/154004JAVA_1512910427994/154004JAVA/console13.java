import java.io.*;
class Student{
	private int StuID;
	private String name;
	private double sub1,sub2,sub3;
	public void getData(){
		try{
			InputStreamReader istr= new InputStreamReader(System.in);
			BufferedReader din= new BufferedReader(istr);
			System.out.println("Enter Student ID and Name : ");
			StuID=Integer.parseInt(din.readLine());
			name=din.readLine();
			System.out.println("Enter marks of Java , SE and CN :");
			sub1=Double.parseDouble(din.readLine());
			sub2=Double.parseDouble(din.readLine());
			sub3=Double.parseDouble(din.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public void putData(){
		System.out.println("\nStudent ID :"+StuID+"Student Name :"+name);
		System.out.println("\nJAVA :"+sub1+"SE :"+sub2+"CN :"+sub3);
		System.out.println("\nTotal :"+(sub1+sub2+sub3)+"\nPercentage :"+((sub1+sub2+sub3)*100)/300);
	}
}

public class console13{
	public static void main(String args[]){
		Student s1=new Student();
			s1.getData();
			s1.putData();
	}
}
