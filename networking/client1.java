import java.util.Scanner;
import java.net.Socket;
import java.io.*;
class client1{
	public static void main(String []ar) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Socket s=new Socket("localhost",1020);
		System.out.println("Connection done!");
		InputStream is=s.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String message=dis.readUTF();
		System.out.println(message);
		String name=sc.next();
		OutputStream os=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF(name);
	}
}