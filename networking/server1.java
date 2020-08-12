import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
class server1{
	public static void main(String []ar) throws Exception
	{
		ServerSocket s=new ServerSocket(1020);
		System.out.println("Waiting for Connection!");
		Socket ss;
		ss=s.accept();
		OutputStream os=ss.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF("Enter your Name:");
		InputStream is=ss.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String m=dis.readUTF();
		System.out.println(m+" is connected!");
	}
}