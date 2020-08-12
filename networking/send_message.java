import java.io.*;
import java.net.*;
public class send_message
{
	public static void send(Socket s,String msg) throws Exception	
	{
		OutputStream os=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF(msg);
	}
}