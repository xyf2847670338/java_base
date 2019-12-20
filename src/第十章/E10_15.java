package ��ʮ��;

class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		// TODO �Զ����ɵĹ��캯�����
		this.flag=flag;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		
			if (flag) {
				while (true ) {
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
						synchronized (knifeAndFork) {
							System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
						}
					}
			}
		}else {
			while(true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName()+"---else---chopsticks");	
				}
			}
		}
		}
	}
}
public class E10_15 {
	public static void main(String[] args) {
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		new Thread(thread1,"Chinese").start();
		new Thread(thread2,"Amreican").start();
		}
}
