package ตฺม๙ีย;
import java.util.HashSet;
class Person{
		String name;
		int age;
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return  name +  ":" + age ;
		}
		@Override
		public int hashCode() {
			return name.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			Student other = (Student) obj;
			return name.equals(name);
		}
}
public class P243_5_1{
	public void main(String[] args) {
		HashSet hs=new HashSet();
		Student stu1=new Student("1","Jack");
		Student stu2=new Student("2","Rose");
		Student stu3=new Student("3","tom");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}
}
