import java.util.*;
class gen<M>
{
	M a;
	gen(M ref)
	{
		a=ref;
	}
	void disp()
	{
		System.out.println(a);;
	}
}

class gen_main
{
	public static void main(String arg[])
	{	
		Scanner sc=new Scanner(System.in);
		gen<Integer> x = new gen<>(13);
		gen<String> z = new gen<>("This is mitz");
		
		/*Integer y;
		int i;
		String s;;
		
		System.out.println("Enter integer value:");
		i=sc.nextInt();
		
		System.out.println("Enter String:");
		s=sc.next();
		
		y=i;
		x.set(y);*/
		x.disp();
		//z.set(s);;
		z.disp();
	}
}