package com.inner_class;
interface Animal{
	void shout();
}

public class E20 {
		public static void main(String[] args) {
			String name="小花";
			animalShout(new Animal() {
				@Override
				public void shout() {
					System.out.println(name+"喵喵喵喵...");
					
					animalShout(()->System.out.println("Lambda 表达式输出:"+name+"喵喵..."));
					
				}
			});
		}

		private static void animalShout(Animal an) {
			an.shout();
			
		}
}
