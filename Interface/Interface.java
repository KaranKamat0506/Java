class Boy{
	String name;
	int age;
	int rollno,marks;

	void accept(){
		name="Karan";
		age=18;
		rollno=21;
		marks=90;
	}

}

interface Student{
	int totmarks=200;
	void putData();
}

class Test extends Boy implements Student{
	int m1,m2;
	void get(int a,int b){
		m1=a;
		m2=b;
	}
	void display(){
		System.out.println("m1=" + m1);
		System.out.println("m2=" + m2);
		System.out.println("Avg=" + (m1+m2)*100/totmarks);
	}
	public void putData(){
		System.out.println("Name=" + name);
		System.out.println("Age=" + age);
		System.out.println("Roll=" + rollno);
		System.out.println("marks=" + marks);
	}
	
}

class Interface{
	public static void main(String args[]){
		Test T=new Test();
		T.accept();
		T.get(89,91);
		T.putData();
		T.display();
	}

}