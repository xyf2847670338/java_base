package ��ʮ��;

class MyThread2 implements Runnable {
	public void run(){
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"��run()����������");
		}
	}
}	
public class E10_2 {
	public static void main(String[] args) {
		MyThread2 myThread2=new MyThread2();
		Thread thread1=new Thread(myThread2,"thread1");
		thread1.start();
		Thread thread2=new Thread(myThread2,"thread2");
		thread2.start();
	}
}
