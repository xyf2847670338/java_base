package 注释;

interface 接口 {
	int ID=1;
	void shout();
	static Animal getID() {
		return Animal.ID;
	}
}
interface lanAnimal extends Animal{
	void run();
}
class Dog implements lanAnimal{
	@Override
	public void shout() {
		System.out.println("出来吧");
	}
	@Override
	public void run() {
		System.out.println("普罗米修斯");
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.run();
	}
}