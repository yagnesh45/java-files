class first
{
	void disp1()
	{
		System.out.println("First");
	}
}

class sec extends first
{
	void disp2()
	{
		System.out.println("Second");
	}
}

class third extends sec
{
	void disp3()
	{
		System.out.println("Third");
	}
}

class multilevel
{
	public static void main(String arg[])
	{
		third t=new third();
		t.disp1();
	}
}