package ������;

public class Runtime_test {

	public static void main(String[] args) throws Exception {
		Runtime rt=Runtime.getRuntime();
		System.out.println("�������ĸ���:"+rt.availableProcessors()+"��");
		
		System.out.println("�����ڴ��С:"+rt.freeMemory()/1024/1024+"M");
		
		System.out.println("�������ڴ��С:"+rt.maxMemory()/1024/1024+"M");
		
		
		Runtime rt1=Runtime.getRuntime();
		rt.exec("notepad.exe");
		
		
		Runtime rt11=Runtime.getRuntime();
		Process process=rt11.exec("notepad.exe");
		Thread.sleep(3000);
		process.destroy();
	}

}
