package hib3;

public class Student {
	String name;
	int id;
	Address p_address,t_address;
	
	public String getName() {
		System.out.println("Name of Student");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		System.out.println("Id of student");
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(){}
	public Address getP_address() {
		return p_address;
	}
	public void setP_address(Address p_address) {
		this.p_address = p_address;
	}
	public Address getT_address() {
		return t_address;
	}
	public void setT_address(Address t_address) {
		this.t_address = t_address;
	}
}
