package ��ʮ��;

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
				System.out.println(Thread.currentThread().getName()+"���ڷ��۵�"+tickets--+"��Ʊ");
			}
		}
		
	}
}
public class E10_11 {
	public static void main(String[] args) {
		SaleThread salethread=new SaleThread();
		new Thread(salethread,"����1").start();
		new Thread(salethread,"����2").start();
		new Thread(salethread,"����3").start();
		new Thread(salethread,"����4").start();
	}
}
