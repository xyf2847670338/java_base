package ��ʮ��;

class YieldThread extends Thread{
	public YieldThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"----"+i);
			if(i==2) {
				System.out.println("�߳��ò�:");
				YieldThread.yield();
			}
		}
	}
}
public class E10_9 {
	public static void main(String[] args) {
		Thread thread1=new YieldThread("thread1");
		Thread thread2=new YieldThread("thread2");
		thread1.start();
		thread2.start();
	}
}
