package ตฺม๙ีย;

import java.util.HashSet;

class Student{
	String id;
	String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
}
	public String toString() {
		return id+":"+name;
}	
	public int hashCobe() {
		return id.hashCode();
}
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj == null)) {
			return false;
		
	}
		Student student=(Student)obj;
		boolean b=this.id.equals(student.id);
		return b;	
}
}
public class E6_10{
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Student stu1=new Student("1","Jack");
		Student stu2=new Student("2","Rose");
		Student stu3=new Student("2","Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}
}

	

	

