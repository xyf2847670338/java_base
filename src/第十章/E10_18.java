package 第十章;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread4 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的claa()方法在运行");
			
		}
		return i;
		
	}
	
}
public class E10_18 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	MyThread4 myThread4=new MyThread4();
	ExecutorService executor=Executors.newCachedThreadPool();
	Future<Object>result1=executor.submit(myThread4);
	Future<Object>result2=executor.submit(myThread4);
	executor.shutdown();
	System.out.println("thread-1返回结果："+result1.get());
	System.out.println("thread-1返回结果："+result2.get());
	}
	
}