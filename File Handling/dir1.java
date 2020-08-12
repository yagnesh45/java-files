import java.io.File;
class dir1
{
	public static void main(String[] ar)
	{
		File f=new File("F:\\MS office 2016");
		String data[]=f.list();
		System.out.println("-->the numbers given beside the folder or dir is the size\n");
		for(String a:data)
		{
			File f1=new File(f,a);
			
			if(f1.isDirectory())
			{
				System.out.println(a+"\t"+f1.length()+"\t<DIR>");
				find1(f1);
			}
			if(f1.isFile())
			{
				System.out.println(a+"\t"+f1.length());
			}
		}
	}
	static void find1(File f1)
	{
		String data[]=f1.list();
		for(String a:data)
		{
			File f2=new File(f1,a);
			
			if(f2.isDirectory())
			{
				System.out.println("\t"+a+"\t"+f2.length()+"\t<DIR>");
				find1(f2);
			}
			if(f2.isFile())
			{
				System.out.println(" |");
				System.out.println(" |--->\t"+a+"\t"+f2.length());
			}
		}
	}
}