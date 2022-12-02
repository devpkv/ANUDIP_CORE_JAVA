package threads;

public class ThreadA extends Thread{

	public void run()
	{
		System.out.println("Thread A");
		System.out.println("i in Thread A");
		for(int i = 1; i <= 5; i++)
		{
			 
			System.out.println("Thread A = " + i);
			
			 
		}
		
		System.out.println("Thread A completed");
	}
}
