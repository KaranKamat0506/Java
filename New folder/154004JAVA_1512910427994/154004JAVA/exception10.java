class NegativeAgeException extends Exception{
	int num;
	NegativeAgeException(int num) {
		this.num=num;
	}
	public String toString(){ 
		return ("NegativeAgeException Occured :"+num);
	}
}

public class exception10{
	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			int age;		
			age=getAge();
			if(age<0){
				throw new NegativeAgeException(age);
			}
			else{
				System.out.println("Age is "+age);
			}
		}
		catch(NegativeAgeException e){
			System.out.println("Catch Block") ;
			System.out.println(e) ;
		}
	}
	public static int getAge(){
		return -7;
	}
}
