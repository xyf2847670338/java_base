package ��ʮ��;

class MyThread1 extends Thread{
	public MyThread1(String name) {
		super(name);
	}

	public void run(){
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"��run()����������");
		}
	}
}	
public class E10_1 {
	public static void main(String[] args) {
		MyThread1 thread1=new MyThread1("thread1");
		thread1.start();
		MyThread1 thread12=new MyThread1("thread2");
		thread12.start();
	}
}
