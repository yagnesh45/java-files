package many_to_many;

public class College {
	int cid;
	String name;
	String dept;
	
	public College()
	{
		System.out.println("constructor of college");
	}
	public int getCid() {
		System.out.println("get college cid");
		return cid;
	}
	public void setCid(int cid) {
		System.out.println("set college cid");
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
