class UDFException //extends Exception
{
	UDFException(String args)
	{
		System.out.println(args);
	}
	UDFException()
	{
	}
	public String toString()
	{
		return("This is My UDF Exception");
	}
}
class thrws
{
	void disp(int n) throws throwable
	{
		if(n==0)
		{
			throw new throwable("UDF");
		}
		else
		{
			System.out.println("Hello");
		}
	}
}
		

class throws_ex2
{
	public static void main(String[] ar)
	{
		thrws z=new thrws();
		try
		{
			z.disp(0);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			//e.getMessege();
		}
	}
}