package com.Rakesh.JPA_Implementation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDB {
	
	@Id
	private int roolno;
	private String Name;
	private int marks;
	public int getRoolno() {
		return roolno;
	}
	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDB [roolno=" + roolno + ", Name=" + Name + ", marks=" + marks + "]";
	}
	

}
