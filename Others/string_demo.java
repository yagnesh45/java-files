import java.util.*;;
class string_demo
{
	public static void main(String arg[])
	{
		String a=new String("Hello");
		String b=new String("Hello");

		boolean x=a.equals(b);
		if(x)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Different");
		}
	}
}
