package threads;

 
public class Deadlock {

	public static void main(String[] args) {
		 
		final String r1 = "Anudip";
		final String r2 = "Foundation";
		
		// anonymous class
		Thread t1 = new Thread() {
			public void run() {
				synchronized (r1) {
					System.out.println("Thread1-lock r1");
					
					try {
						Thread.sleep(100);
					} catch(Exception e) {
						System.out.println(e.getMessage());
					}
					
					synchronized (r2) {
						System.out.println("Thread2-lock r2");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (r2) {
					System.out.println("Thread2-lock r2");
					
					try {
						Thread.sleep(100);
					} catch(Exception e) {
						System.out.println(e.getMessage());
					}
					
					synchronized (r1) {
						System.out.println("Thread1-lock r1");
					}
				}
			}
		};
		t1.start();
		t2.start();

	}

}
