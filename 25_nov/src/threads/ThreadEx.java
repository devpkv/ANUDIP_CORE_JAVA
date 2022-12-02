 package threads;

public class ThreadEx implements Runnable{

	public static void main(String[] args) {
		
		ThreadEx te = new ThreadEx();
		Thread t = new Thread(te);
		t.start();

	}

	@Override
	public void run() {
		 System.out.println("Start "+ Thread.currentThread().getName());
		 
		 try {
			Thread.sleep(2000);
			System.out.println("Inside Thread");
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		
	}

}
