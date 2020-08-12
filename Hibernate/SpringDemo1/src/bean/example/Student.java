package bean.example;

public class Student {
	int id;
	String name;
	
	public String toString(){
		return id+":"+name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student(){
		id = 101;
		//name = "old";
	}
	
	public Student(int id){
		this.id=id;
		System.out.println("Parame Constr. :"+id);
	}
}
