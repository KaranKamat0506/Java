class Throw{
	
	public static void Valid(int age){
		
		
		if(age<18){
			throw new ArithmeticException("Negative Age" + "\t Please enter valid age");
		
		}
		else{
			System.out.println("Welcome");
		}
		
	}

	public static void main(String args[]){
		int age;
		try{
			age=Integer.parseInt(args[0]);
			Valid(age);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
	}

}