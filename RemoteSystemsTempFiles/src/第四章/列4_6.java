package ������;
class Animal{
		@Override
		public String toString() {
			return"����һֻ�������õ���������˹-¬���";
		}
	}
class Dog extends Animal{
	@Override
	public String toString() {
		return"(\r\n" + 
				"         ____()()\r\n" + 
				"        /      @@\r\n" + 
				"  `~~~~~\\_;m__m._>o )ȥ��-¬���";
	}
}
public class ��4_6 {
	public static void main(String[] args) {
		Animal animal=new Animal();
		Dog lya=new Dog();
		System.out.println(animal.toString());
		System.out.println(lya.toString());
	}
}
