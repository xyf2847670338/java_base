package ��ʮ��;

class TicketWindow extends Thread{
	private int tickets=100;
	public void run(){
		while (true) {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"���ڷ��۵�"+tickets--+"��Ʊ");
			}
		}
	}
}
public class E10_4 {
	public static void main(String[] args) {
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
	}
}
