import java.io.*;
class Student{
	 int roll;
	 String name;
	 double sub1,sub2,sub3;
	 void getData(){
		try{
			InputStreamReader istr= new InputStreamReader(System.in);
			BufferedReader din= new BufferedReader(istr);
			System.out.println("Enter Rollno and Name : ");
			roll=Integer.parseInt(din.readLine());
			name=din.readLine();
			System.out.println("Enter marks of 3 Subjects:");
			sub1=Double.parseDouble(din.readLine());
			sub2=Double.parseDouble(din.readLine());
			sub3=Double.parseDouble(din.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	 void putData(){
		System.out.println("\nRollno :"+roll+" Student Name :"+name);
		System.out.println("\nSub1 :"+sub1+"\tSub2 :"+sub2+"\tSub3 :"+sub3);
		System.out.println("\nTotal :"+(sub1+sub2+sub3)+"\nPercentage :"+((sub1+sub2+sub3)*100)/300);
	}
}

 class Console{
	public static void main(String args[]){
		Student s1=new Student();
			s1.getData();
			s1.putData();
	}
}
