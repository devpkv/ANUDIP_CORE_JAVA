package java8;

public class LamdaEx {

	public static void main(String[] args) {
		 
		new Thread(new Runnable() {

			@Override
			public void run() {
				 
				System.out.println("Without lamda");
				
			}
			
			
		}).start();
		
		new Thread(() -> {

			System.out.println("With lamda");
			
		}).start();

	}

}
