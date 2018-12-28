import java.lang.*;
class FirstThread extends Thread{
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println(i);
		}
	System.out.println(" First Thread Finished ");
	}
}

class SecondThread extends Thread{
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println(i);
		}
	System.out.println(" Second Thread Finished ");
	}
}

class ThirdThread extends Thread{
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println(i);
		}
	System.out.println(" Third Thread Finished ");
	}
}

public class multi12thread{
	public static void main(String arg[]){
		FirstThread a1 = new FirstThread();
		SecondThread b1 = new SecondThread();
		ThirdThread c1 = new ThirdThread();
		a1.start();
		b1.start();
		c1.start();
	}
}
