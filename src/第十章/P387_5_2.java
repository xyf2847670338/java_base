package ��ʮ��;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Qiuhe_thread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=1;i<11;i++) {
			sum+=i;
		}
		switch(Thread.currentThread().getName()) {
		case "�߳�1":
			break;
		case "�߳�2":
			sum+=10*10;
			break;
		case "�߳�3":
			sum+=20*10;
			break;
		case "�߳�4":
			sum+=30*10;
			break;
		case "�߳�5":
			sum+=40*10;
			break;
		case "�߳�6":
			sum+=50*10;
			break;
		case "�߳�7":
			sum+=60*10;
			break;
		case "�߳�8":
			sum+=70*10;
			break;
		case "�߳�9":
			sum+=80*10;
			break;
		case "�߳�10":
			sum+=90*10;
			break;
		default:
			break;
		}
		return sum;
	}
}
public class P387_5_2 {
	public static void main(String[] args) throws Exception, ExecutionException {
			Qiuhe_thread qh1=new Qiuhe_thread();
			FutureTask<Object> ft1=new FutureTask<Object>(qh1);
			new Thread(ft1,"�߳�1").start();
			
			Qiuhe_thread qh2=new Qiuhe_thread();
			FutureTask<Object> ft2=new FutureTask<Object>(qh2);
			new Thread(ft2,"�߳�2").start();
			
			Qiuhe_thread qh3=new Qiuhe_thread();
			FutureTask<Object> ft3=new FutureTask<Object>(qh3);
			new Thread(ft3,"�߳�3").start();
			
			Qiuhe_thread qh4=new Qiuhe_thread();
			FutureTask<Object> ft4=new FutureTask<Object>(qh4);
			new Thread(ft4,"�߳�4").start();
			
			Qiuhe_thread qh5=new Qiuhe_thread();
			FutureTask<Object> ft5=new FutureTask<Object>(qh5);
			new Thread(ft5,"�߳�5").start();
			
			Qiuhe_thread qh6=new Qiuhe_thread();
			FutureTask<Object> ft6=new FutureTask<Object>(qh6);
			new Thread(ft6,"�߳�6").start();
			
			Qiuhe_thread qh7=new Qiuhe_thread();
			FutureTask<Object> ft7=new FutureTask<Object>(qh7);
			new Thread(ft7,"�߳�7").start();
			
			Qiuhe_thread qh8=new Qiuhe_thread();
			FutureTask<Object> ft8=new FutureTask<Object>(qh8);
			new Thread(ft8,"�߳�8").start();
			
			Qiuhe_thread qh9=new Qiuhe_thread();
			FutureTask<Object> ft9=new FutureTask<Object>(qh9);
			new Thread(ft9,"�߳�9").start();
			
			Qiuhe_thread qh10=new Qiuhe_thread();
			FutureTask<Object> ft10=new FutureTask<Object>(qh10);
			new Thread(ft10,"�߳�10").start();
			
			int total=(int)ft1.get()+(int)ft2.get()+(int)ft3.get()+(int)ft4.get()+(int)ft5.get()+(int)ft6.get()+(int)ft7.get()+(int)ft8.get()+(int)ft9.get()+(int)ft10.get();
			System.out.println("10���̵߳ĺ���"+total);
	}
}