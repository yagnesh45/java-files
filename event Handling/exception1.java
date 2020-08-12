class exception1
{
	int c;
	void divide(int a,int b)
	{
		c=a/b;
	}
}
class y
{
	public static void main(String []ar)
	{
		try{
		exception1 e=new exception1();
		e.divide(10,0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("exception in the program");
		}
	}
}