package com.school;

public class Studengt {
	//定义两个成员变量
	//private：类可见性 当前属性只能在本类中被访问
	//将成员变量定义为私有的，就是类的封装
	//外部方法要访问这个成员变量，必须通过公有的getter setter方法
	String xingming;//字符转类型的姓名
	//没有修饰符：包可见性，当前属性只能在本包中被访问
	int chengji;//整形的成绩
	//get：获取  set：设置
	//如果没有定义任何构造方法，java虚拟机会自动创建一个无参的构造方法
	//如果有了带参数的构造方法，java虚拟机会将不会自动创建一个无参的构造方法
	//不管什么情况，都给类添加一个屋参数的构造方法
	//定义无参的构造方法：
	//构造方法是一种特殊的方法：修饰符+类名([参数类型 参数名]){}
	public Studengt(String xingming, int chengji) {
		this.xingming = xingming;
		this.chengji = chengji;
		// TODO 自动生成的构造函数存根
	}
	public String getXinming() {
		return xingming;
	}
	public Studengt() {
		super();
	}
	public void setXinming(String xingming) {
		this.xingming = xingming;
	}
	public int getChengji() {
		return chengji;
	}
	public void setChengji(int chengji) {
		this.chengji = chengji;
	}

}
