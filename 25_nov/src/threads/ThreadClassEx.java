package threads;

public class ThreadClassEx extends Thread {

	public ThreadClassEx(String name) {
		super(name);
	}
	public void run()
	{
		System.out.println("Thread Start");
	}
	public static void main(String[] args) {
		 
		ThreadClassEx tc = new ThreadClassEx("My Thread");
		tc.start();
		System.out.println(tc.getName());
	}

}
