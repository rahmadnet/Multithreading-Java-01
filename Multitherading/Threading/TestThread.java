package Threading;

public class TestThread extends Thread
{

	public static void main(String[] args)
	{
		System.out.println("Inside : " + Thread.currentThread().getName());
		
		System.out.println("Creating Thread...");
		Thread thread = new TestThread();
		
		System.out.println("Starting Thread...");
		thread.start();
	}
	
	@Override
	public void run() 
	{
		System.out.println("Inside : " + Thread.currentThread().getName());
	}

}
