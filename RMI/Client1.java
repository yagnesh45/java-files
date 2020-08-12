import java.rmi.server.*;
import java.rmi.*;
import java.util.*;

public class Client1 {
	public static void main(String []ar) throws Exception{
		RMIMethods m;
		m=(RMIMethods)Naming.lookup("rmi://localhost:4561/object-name");
		List<Emp> list=m.getEmployeesName();
		for(int i=0;i<list.size();i++){
			Emp e=(Emp)list.get(i);
			System.out.println("Id: "+e.getId()+"\t Fname:"+e.getFname()+"\t Lname:"+
								e.getLname()+"\t Salary:"+e.getSal());
		}
		// System.out.println("Object of RMIMethods interface:"+m);
		// int ans=m.add(30,40);
		// System.out.println("Sum of a and b:"+ans);
	}
}