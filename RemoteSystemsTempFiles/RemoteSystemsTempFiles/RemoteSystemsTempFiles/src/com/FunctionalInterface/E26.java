package com.FunctionalInterface;



@FunctionalInterface
interface PersonBuilder{
	Person builderPerson(String name);

	
}
class Person{
	private String name;
	
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class E26 {
	public static void printName(String name,PersonBuilder builder) {
		System.out.println(builder.builderPerson(name).getName());
	}
	public static void main(String[] args) {
		printName("Ѧ֮ǫ",new PersonBuilder() {
			
			@Override
			public Person builderPerson(String name) {
				// TODO �Զ����ɵķ������
				return new Person("Ѧ֮ǫ");
			}
		});
		printName("Ѧ֮ǫ",name->new Person(name));
		printName("Ѧ֮ǫ",Person::new);
	}

}
