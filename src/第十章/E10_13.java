package ��ʮ��;

class SaleThread3 implements Runnable{
	private int tickets=10;
	public void run() {
		while (true) {
			maipiao();
	}
	}
private synchronized void maipiao() {
	if(tickets>0) {
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	System.out.println(Thread.currentThread().getName()+"���ڷ���"+tickets--+"��Ʊ");
	}
	}
		
	}
public class E10_13 {
	public static void main(String[] args) {
		SaleThread3 saleThread=new SaleThread3();
		new Thread(saleThread,"���� 1").start();
		new Thread(saleThread,"���� 2").start();
		new Thread(saleThread,"���� 3").start();
		new Thread(saleThread,"���� 4").start();
	}
}