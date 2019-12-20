package 第十章;

import java.util.concurrent.locks.*;

class LockThread implements Runnable{
	private int tickets=10;
	private final Lock lock=new ReentrantLock();
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true ) {
			lock.lock(); 
				
			
			if (tickets>0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+"正在发售"+tickets--+"张票");
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
		new Thread(lockThread,"窗口 1").start();
		new Thread(lockThread,"窗口 2").start();
		new Thread(lockThread,"窗口 3").start();
		new Thread(lockThread,"窗口 4").start();
		}
}
