import java.rmi.server.*;
import java.rmi.*;
import java.sql.*;
import java.util.*;

public class MyClass1 extends UnicastRemoteObject implements RMIMethods{
	MyClass1() throws RemoteException{
		super();
	}
	
	public List<Emp> getEmployeesName() throws RemoteException{
		List<Emp> list=new ArrayList();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RMI","root","");
			Statement st=connection.createStatement();
			String query="select * from Emp";
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()){
				Emp e=new Emp();
				e.setId(rs.getInt("id"));
				e.setFname(rs.getString("fname"));
				e.setLname(rs.getString("lname"));
				e.setSal(rs.getInt("sal"));
				
				list.add(e);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	/*public int add(int a,int b){
		return a+b;
	}*/
}