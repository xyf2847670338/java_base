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
		printName("薛之谦",new PersonBuilder() {
			
			@Override
			public Person builderPerson(String name) {
				// TODO 自动生成的方法存根
				return new Person("薛之谦");
			}
		});
		printName("薛之谦",name->new Person(name));
		printName("薛之谦",Person::new);
	}

}
