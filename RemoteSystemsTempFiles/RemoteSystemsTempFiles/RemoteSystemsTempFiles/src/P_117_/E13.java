package P_117_;
interface Animal{
	public abstract void shout();
		}
class Dog implements Animal{
	@Override
	public void shout() {
		System.out.println("³öÀ´°É!");
	}
}
public class E13 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
	}
	
}
