package Runnable;

public class LambdaExpression
{

	public static void main(String[] args)
	{
		System.out.println("Inside : " + Thread.currentThread().getName());
		
		System.out.println("Creating Runnable...");
		Runnable runnable = () -> 
		{
			System.out.println("Inside : " + Thread.currentThread().getName());
		};
		
		System.out.println("Creating Thread...");
		Thread thread = new Thread(runnable);
		
		System.out.println("Starting Theread...");
		thread.start();
	}

}
