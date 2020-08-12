//ref of the interface
interface first
{
	void disp();
}
class sec implements first
{
	public void disp()
	{
		System.out.println("disp method");
	}
}
class ss
{
	public static void main(String ar[])
	{
		first z;
		z = new sec();
		z.disp();
	}
}