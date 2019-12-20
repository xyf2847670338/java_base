package ��ʮ��;

import java.util.concurrent.locks.*;

class LockThread implements Runnable{
	private int tickets=10;
	private final Lock lock=new ReentrantLock();
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while (true ) {
			lock.lock(); 
				
			
			if (tickets>0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+"���ڷ���"+tickets--+"��Ʊ");
				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				finally {
					lock.unlock();
				}
				
			}
		}
	}
	
}
public class E10_14 {
	public static void main(String[] args) {
		LockThread lockThread=new LockThread();
		new Thread(lockThread,"���� 1").start();
		new Thread(lockThread,"���� 2").start();
		new Thread(lockThread,"���� 3").start();
		new Thread(lockThread,"���� 4").start();
		}
}
