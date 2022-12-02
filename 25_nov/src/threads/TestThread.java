package threads;

public class TestThread {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		 
		ta.start(); 
		ta.setPriority(Thread.MAX_PRIORITY);
		 
		tb.start();
		System.out.println("End");
	}

}
