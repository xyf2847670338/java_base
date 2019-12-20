package com.polymorphism;
interface Animal{
	void shout();
}
class Cat implements Animal {
	
	@Override
	public void shout() {
		System.out.println("����.....");
	}
	public void catchMouse() {
		System.out.println("è׽����(����)");
	}
}
class Dog implements Animal{
	
	@Override
	public void shout() {
		System.out.println("����....");
	}
}
public class E15{
	
	public static void main(String[] args) {
		Animal an1=new Cat();
		an1.shout();
		Animal an2=new Dog();
		an2.shout();
		if (an1 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}else {
			System.out.println("�����͵Ķ�����Cat����");
		}
		if (an2 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}else {
			System.out.println("�����͵Ķ�����Cat����");
		}
	}
	
}
