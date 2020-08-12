import java.io.*;
import java.io.IOException;
import java.util.Scanner;
class file3
{
	public static void main(String []ar)
	{
		File f=new File("E:\\java\\File Handling\\file3.java");
		File f1=new File("E:\\java\\File Handling\\1.txt");
		if(!f.exists())
		{
			System.out.println("File Doesn't Exists");
			return;
		}
		if(!f1.exists())
		{
			System.out.println("File Doesn't Exists");
			return;
		}
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{			
			fis=new FileInputStream(f);
			fos=new FileOutputStream(f1);
			int a;
			byte[] buffer=new byte[512];
			while((a=fis.read(buffer))>0)
			{
				fos.write(buffer,0,a);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*catch(IndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}*/
	}
}