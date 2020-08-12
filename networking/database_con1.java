import java.sql.*;
import java.util.*;
class db1
{
	String driver="sun.jdbc.odbc.JdbcOdbcDriver";
	String url="jdbc:odbc:Db1_java1";
	Connection con;
	ResultSet result;
	Scanner sc;
	Statement st;
	void connect() throws Exception
	{
		Class.forName(driver);
		con=DriverManager.getConnection(url);
		st=con.createStatement();
		sc=new Scanner(System.in);
	}
	public static void main(String []ar) throws Exception
	{
		int n;
		Scanner sc;
		sc=new Scanner(System.in);
		db1 db=new db1();
		do{
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Search");			
			System.out.println("5.Display");			
			System.out.println("6.Exit");
			System.out.println("Enter your choice");			
			n=sc.nextInt();
			switch(n)
			{
				case 1:db.insert();break;
				case 2:db.update();break;
				case 3:db.delete();break;
				case 4:db.search();break;
				case 5:db.display();break;
				default:System.exit(0);				
			}
		}while(n!=6);
	}
	void insert() throws Exception{
		int id,sal,deptid;
		String name,dept;
		connect();
		System.out.println("Enter the details of employee-->");
		System.out.println("Enter the ID:");
		id=sc.nextInt();
		System.out.println("Enter the Name:");
		name=sc.next();
		System.out.println("Enter the salary:");
		sal=sc.nextInt();
		System.out.println("Enter the dept:");
		dept=sc.next();
		System.out.println("Enter the deptID:");
		deptid=sc.nextInt();
		
		String query="insert into table1_java values ("+id+",'"+name+"',"+sal+",'"+dept+"',"+deptid+")";
		// insert into table1_java values(1,'yagnesh',20000,'IT',16);
		
		st.executeUpdate(query);
		
		System.out.println("1 row(s) inserted");
		//con.closeConnection(driver);
	}
	void update()throws Exception{
		connect();
	}
	void delete()throws Exception{
		connect();
	}
	void search()throws Exception{
		connect();
	}
	void display()throws Exception{
		connect();
	}
}