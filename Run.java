class Thread1 implements Runnable {
	public void run() {
		try {
			System.out.println("Thread 1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Thread2 implements Runnable {
	public void run() {
		try {
			System.out.println("Thread 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Run{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.run();
		t2.run();
	}
}
