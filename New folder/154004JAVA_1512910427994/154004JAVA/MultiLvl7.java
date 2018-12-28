class Employee{
	public int empID;
	public String name;
	public void getData(){
		empID=16645;
		name="Rohit";
	}
	public void putData(){
		System.out.println("\nEmployee ID :"+empID+"Employee Name :"+name);
	}
}

class Manager extends Employee{
	public int manID;
	public String projN;
	public void gain(){
		manID=29986;
		projN="Augmented Reality";
	}
	public void put(){
		System.out.println("\nManager ID :"+manID+"Manager Name :"+projN);
	}
}

class Engineer extends Manager{
	public int prodID;
	public double sal;
	public void get(){
		prodID=64752;
		sal=74500.90;
	}
	public void display(){
		System.out.println("\nProduct ID :"+prodID+"Salary :"+sal);
	}
}

public class MultiLvl7{
	public static void main(String args[]){
		Engineer e1=new Engineer();
		e1.getData();
		e1.gain();
		e1.get();
		e1.putData();
		e1.put();
		e1.display();
	}
}

