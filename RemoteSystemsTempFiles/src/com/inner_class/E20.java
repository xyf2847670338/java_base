package com.inner_class;
interface Animal{
	void shout();
}

public class E20 {
		public static void main(String[] args) {
			String name="С��";
			animalShout(new Animal() {
				@Override
				public void shout() {
					System.out.println(name+"��������...");
					
					animalShout(()->System.out.println("Lambda ���ʽ���:"+name+"����..."));
					
				}
			});
		}

		private static void animalShout(Animal an) {
			an.shout();
			
		}
}
