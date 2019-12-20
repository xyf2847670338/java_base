package com.jicheng;
//定义动物类
class Animal{
	String name;
	
	public Animal() {
		System.out.println("我是一只动物");
	}

	public Animal(String name) {
		System.out.println("你是一只"+name);
	}
	
	void shout(){
		System.out.println("动物发出叫声");
	}
}
//定义dog类继承Anlimal类
class Dog extends Animal{
	
	
	public Dog() {
		super("沙皮狗");
	}
	
	public Dog(String name) {
		super("沙皮狗");
	}
	//继承了Anlimal类所有可以继承的方法和成员变量
	void printName(){
		System.out.println("name:"+name);
	}
	@Override//重写  前面override是注释
	void shout(){
		super.shout();
		System.out.println("汪汪......");
	}
}
public class E01{
	public static void main(String[] args){
		Dog dog=new Dog();
		/*dog.name="哈士奇";
		dog.printName();
		dog.shout();*/
	}
}