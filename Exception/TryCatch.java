class Error3{

	public static void main(String args[]){
		int a=8;
		int b=4;
		int c=4;
		int x,y;
		try{
			x=a/(b-c);
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero");
		}
		
		y=a/(b+c);

		System.out.println("y=" +y);
	}
}