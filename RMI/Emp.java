import java.io.*;

public class Emp implements Serializable{
	String fname,lname;
	int id;
	int sal;
	
	void setFname(String fname){
		this.fname=fname;
	}
	void setLname(String lname){
		this.lname=lname;
	}
	void setSal(int sal){
		this.sal=sal;
	}
	void setId(int id){
		this.id=id;
	}
	
	String getFname(){
		return fname;
	}
	String getLname(){
		return lname;
	}
	int getSal(){
		return sal;
	}
	int getId(){
		return id;
	}
}