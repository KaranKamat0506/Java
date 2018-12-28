class TestPriority extends Thread{
	public void run(){
		System.out.println("Running thread name is:" + thread.currentThread.getName());
		System.out.println("Running thread Priority is:" + thread.currentThread.getPriority());
	}
	public static void main(String[] args) {
		TestPriority t1=new TestPriority();
		TestPriority t2=new TestPriority();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}