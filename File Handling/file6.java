import java.io.*;
import java.io.IOException;
import java.util.Scanner;
class file6
{
	public static void main(String []ar)
	{
		File f=new File("E:\\java\\File Handling\\1.txt");
		File f1=new File("E:\\java\\File Handling\\2.txt");
		File merge=new File("E:\\java\\File Handling\\merge.txt");
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
		if(!merge.exists())
		{
			System.out.println("File Doesn't Exists");
			return;
		}
		FileInputStream fis1=null;
		FileInputStream fis2=null;
		FileOutputStream fos=null;
		try
		{	
			fis1=new FileInputStream(f);
			fis2=new FileInputStream(f1);
			fos=new FileOutputStream(merge);
			int a;
			int temp=(int)f.length();
			byte[] buffer1=new byte[1024];
			byte[] buffer2=new byte[2048];
			while((a=fis1.read(buffer1))>0)
			{
				fos.write(buffer1,0,a);
			}
			while((a=fis2.read(buffer2))>0)
			{
				fos.write(buffer2,temp+1,a);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}