package ������;



class person extends Object{
	@Override
	public void finalize() {
		System.out.println("���󽫱�������������.....");
	}
	}
public class E37 {
	private static void huishoulaji1() {
		person p1=new person();
		p1=null;
		int i=1;
		while (i<10) {
			System.out.println("����1ѭ����------");
			i++;
		}
	}
	private static void huishoulaji2() {
		person p2=new person();
		p2=null;
		System.gc();
		int i=1;
		while (i<10) {
			System.out.println("����2ѭ����-----");
			i++;
		}
	}
	public static void main(String[] args) {
		huishoulaji1();
		System.out.println("----------------------");
		huishoulaji2();
	}
}
