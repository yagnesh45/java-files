import java.io.*;
import java.util.Scanner;
class file4
{
	public static void main(String []ar)
	{
		File f=new File("E:\\java\\File Handling\\file4.java");
		if(!f.exists())
		{
			System.out.println("File doesn't Exists");
			return;
		}
		byte[] b=new byte[1024];
		FileInputStream fis=null;
		try{
		int Count=0;
		fis=new FileInputStream(f);
		int a;
		while((a=fis.read(b))>0)
		{
			Count++;
		}
		System.out.println("Size of the file is:"+Count+"KB");
		System.out.println("Size of the file is:"+f.length());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}