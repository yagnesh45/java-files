package many_to_many;

public class Student {
	int sid;
	String name;
	int mobNo;
	College c;
	
	public College getC() {
		return c;
	}

	public void setC(College c) {
		this.c = c;
	}

	public Student(){
		System.out.println("constructor of std");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	
}
