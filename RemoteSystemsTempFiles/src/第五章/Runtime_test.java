package 第五章;

public class Runtime_test {

	public static void main(String[] args) throws Exception {
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器的个数:"+rt.availableProcessors()+"个");
		
		System.out.println("空闲内存大小:"+rt.freeMemory()/1024/1024+"M");
		
		System.out.println("最大可用内存大小:"+rt.maxMemory()/1024/1024+"M");
		
		
		Runtime rt1=Runtime.getRuntime();
		rt.exec("notepad.exe");
		
		
		Runtime rt11=Runtime.getRuntime();
		Process process=rt11.exec("notepad.exe");
		Thread.sleep(3000);
		process.destroy();
	}

}
