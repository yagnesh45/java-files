import java.rmi.*;
import java.util.*;

public interface RMIMethods extends Remote{
	//int add(int a, int b) throws RemoteException;
	List<Emp> getEmployeesName() throws RemoteException;
}