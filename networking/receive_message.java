import java.io.*;
import java.net.*;
public class receive_message{
	public static String receive(Socket s) throws Exception
	{
		InputStream is=s.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String msg=dis.readUTF();
		
		return msg;
	}
}