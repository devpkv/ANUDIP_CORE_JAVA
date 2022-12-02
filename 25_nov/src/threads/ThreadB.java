package threads;

public class ThreadB extends Thread{

	public void run()
	{
		System.out.println("Thread B");
		System.out.println("i in Thread B");
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Thread B = " + i);
			 
		}
		
		System.out.println("Thread B completed");
	}
}
