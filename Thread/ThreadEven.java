class A extends Thread{
	public void run(){
		for( int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println(i+" ");
			}
		}
		System.out.println("Exit from thread A");
	}
	
}

class B extends Thread{
	public void run(){
		for(int j=1;j<=10;j++){
			if(j%2!=0){
				System.out.println(j+" ");
			}
		}
		System.out.println("Exit from thread B");
	}
}

class ThreadEven{
	public static void main(String[] args) {
		new A().start();
		new B().start();
	}
}