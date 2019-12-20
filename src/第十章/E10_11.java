package 第十章;

class SaleThread implements Runnable{
	private int tickets=10;
	public void run() {
		while(true) {
			if(tickets>0) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
			}
		}
		
	}
}
public class E10_11 {
	public static void main(String[] args) {
		SaleThread salethread=new SaleThread();
		new Thread(salethread,"窗口1").start();
		new Thread(salethread,"窗口2").start();
		new Thread(salethread,"窗口3").start();
		new Thread(salethread,"窗口4").start();
	}
}
