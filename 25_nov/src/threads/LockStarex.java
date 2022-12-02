package threads;

public class LockStarex extends Thread{
	static int tc = 1;
	public void run() {
		System.out.println(tc+" st child");
		System.out.println("ct exe complete");
		try {
			Thread.sleep(100);
			tc++;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public static void main(String[] args) {
		
		System.out.println("Main thread execution starts");
		LockStarex ls1 = new LockStarex();
		ls1.setPriority(1);
		LockStarex ls2 = new LockStarex();
		ls2.setPriority(9);
		LockStarex ls3 = new LockStarex();
		ls3.setPriority(8);
		LockStarex ls4 = new LockStarex();
		ls4.setPriority(7);
		LockStarex ls5 = new LockStarex();
		ls5.setPriority(6);
		LockStarex ls6 = new LockStarex();
		ls6.setPriority(5); 
		
		ls1.start();
		ls2.start();
		ls3.start();
		ls4.start();
		ls5.start();
		ls6.start();
		
		System.out.println("Main Thread Execution completes");

	}
	
	

}
