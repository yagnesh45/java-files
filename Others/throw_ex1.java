import java.util.*;
class throw_ex1
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			int x;
			int y;
			int z;
			x=sc.nextInt();
			y=sc.nextInt();
			if (x==2)
				
			{
				System.out.println("in throw");
				throw new Exception("Error throw");
			}
			z=x/y;
			System.out.println(z);			
		}
		catch(Exception x)
		{
			System.out.println(x);;
		}
	}
}