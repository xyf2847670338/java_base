package ��ʮ��;

public class E10_7 {
	public static void main(String[] args) {
		Thread thread1=new Thread(()->{
			for (int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+"�������i:"+i);
			}
		},"���ȼ����ϵ͵��߳�");
			Thread thread2=new Thread(()->{
				for (int j=0;j<10;j++) {
					System.out.println(Thread.currentThread().getName()+"�������j:"+j);
				}
			},"���ȼ����ϸߵ��߳�");
			thread1.setPriority(Thread.MIN_PRIORITY);
			thread2.setPriority(10);
			thread1.start();
			thread2.start();
	}
}
