package ע��;

interface �ӿ� {
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
		System.out.println("������");
	}
	@Override
	public void run() {
		System.out.println("��������˹");
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.run();
	}
}