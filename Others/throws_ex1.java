class thrws
{
	void disp(int n) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		if(n==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
		

class throws_ex1
{
	public static void main(String[] ar)
	{
		thrws z=new thrws();
		try
		{
			z.disp(10);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			//e.getMessege();
		}
	}
}