package ������;

import java.util.Random;

public class Ssq {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("˫ɫ�򿪽����:");
		System.out.println("�������������:");
		Random r = new Random();
		int hq;
		for (int i = 0; i < 6; i++) {
			hq = r.nextInt(33) + 1;
			System.out.print(hq + " ");
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		System.out.println("\nһ�����������:");
		Thread.sleep(1000);
		int lq = r.nextInt(16) + 1;
		System.out.println(lq + " ");

	}
}
