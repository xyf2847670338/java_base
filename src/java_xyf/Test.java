package java_xyf;

public class Test {
		public Test() {
			System.out.println("���﷽��һ��������");
		}
		public Test(int x) {
			this();
			System.out.println("���﷽������������");
		}
		public Test(boolean b) {
			this(1);
			System.out.println("���﷽������������");
		}
		public static void main(String[] args) {
			Test test=new Test(true); 
		}
}
