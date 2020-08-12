package one_to_many;

public class Student {
	//int cid;
	int sid;
	String name;
	int mobNo;
	
	public Student(){
		System.out.println("constructor of std");
	}

/*	public int getCid() {
		System.out.println("get std cid");
		return cid;
	}

	public void setCid(int cid) {
		System.out.println("set std cid");
		this.cid = cid;
	}
*/
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
