package vna03_J_CSC;


public class TestThread1 implements Runnable {

	public void run() {
		KeyedCounter test = new KeyedCounter();
		String key = Thread.currentThread().getName(); 
		test.increment(key);
     	System.out.println(key + " " + test.getCount(key));
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread1 t = new TestThread1();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
