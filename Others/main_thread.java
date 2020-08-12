class my_thread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		}
	}
}

class my_thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		}
	}
}
class main_thread
{
	public static void main(String[] ar)
	{
		my_thread z = new my_thread();
		my_thread1 x = new my_thread1();
		
		
		z.start();
		x.start();
	}
}