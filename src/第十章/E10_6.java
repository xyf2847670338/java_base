package ��ʮ��;

class DamonThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()+"---������");
		}
	}
}
public class E10_6 {
	public static void main(String[] args) {
		System.out.println("main�߳��Ǻ�̨�߳���?"+Thread.currentThread().isDaemon());
		DamonThread dt=new DamonThread();
		Thread thread=new Thread(dt,"��̨�߳�");
		System.out.println("thread�߳�Ĭ���Ǻ�̨�߳���?"+thread.isDaemon());
		thread.setDaemon(true);
		thread.start();
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
