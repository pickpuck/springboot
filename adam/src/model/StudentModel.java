package model;

public class StudentModel {
	private String name;
	private int age;
	private String sex;
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	
	public void setsex(String sex) {
		this.sex=sex;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public String getsex() {
		return sex;
	}
}
