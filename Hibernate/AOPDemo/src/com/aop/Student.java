package com.aop;

public class Student {
	int id;
	String name;
	
	public String toString(){
		return id+":"+name;
	}
	public void setId(int id) {
		System.out.println("setId:"+id);
		this.id = id;
	}
	public void setName(String name) {
		System.out.println("setName:"+name);
		this.name = name;
	}
	
	public Student(){}
}
