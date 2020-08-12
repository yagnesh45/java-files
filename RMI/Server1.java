import java.rmi.server.*;
import java.rmi.*;

public class Server1 {
	public static void main(String []ar) throws Exception{
		MyClass1 obj = new MyClass1();
		//System.out.println("Object of MyClass1:"+obj);
		Naming.rebind("rmi://localhost:4561/object-name",obj);
	}
}