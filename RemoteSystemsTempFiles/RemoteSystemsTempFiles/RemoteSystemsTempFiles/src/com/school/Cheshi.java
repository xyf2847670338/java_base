package com.school;

public class Cheshi {
	public static void main(String[] args) {
		Studengt s1=new Studengt();
		s1.setXinming("pete");
		s1.setChengji(666);
		System.out.println(s1.getXinming()+"考了"+s1.getChengji());
		
		Studengt s2=new Studengt("Alice",999);
		System.out.println(s2.getXinming()+"考了"+s2.getChengji());	
		
		
		Course c1=new Course();
		c1.setCourse_name("java程序设计");
		c1.setCourse_book("java基础入门");
		System.out.println(c1.getCourse_name()+"考了"+c1.getCourse_book());
	}

	
}
