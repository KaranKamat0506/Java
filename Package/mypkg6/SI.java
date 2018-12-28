class Person{
	int age;
	String name;
	void getdata(n,a){
		name=n;
		age=a;
	}
	void putdata(){
		System.out.println("Name:" + n);
		System.out.println("Age:" + a);
	}
}

class SI{
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		p1.getdata("Karan",18);
		p1.putdata();
		p2.getdata("Sukrut",18);
		p2.putdata();
	}
}

