package ��ʮ��;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread3 implements Callable<Object>{
	public Object call()throws Exception{
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"��run()����������");
		}
		return i;
	}
}
public class E10_3 {
	public static void main(String[] args) throws InterruptedException,ExecutionException{
		MyThread3 myThread3=new MyThread3();
		FutureTask<Object>ft1=new FutureTask<>(myThread3);
		Thread thread1=new Thread(ft1,"thread1");
		thread1.start();
		FutureTask<Object>ft2=new FutureTask<>(myThread3);
		Thread thread2=new Thread(ft2,"thread1");
		thread2.start();
		System.out.println("thread1���ؽ��:"+ft1.get());
		System.out.println("thread2���ؽ��:"+ft2.get());
		
	}
}
