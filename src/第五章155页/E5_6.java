package ������155ҳ;

public class E5_6 {
	public static void main(String[] args) {
		String str="2019-10-12";
		System.out.println("�ӵ������ַ���ȡ��ĩβ�Ľ��"+str.substring(5));
		System.out.println("�ӵ������ַ���ȡ�����߸��ַ��Ľ��"+str.substring(5,7));
		System.out.println("�ָ����ַ��������е�Ԫ������Ϊ:");
		String[] strArray=str.split("-");
		for (int i=0;i<strArray.length;i++) {
			if(i!=strArray.length-1) {
				System.out.print(strArray[i]+"��");
			}else {
				System.out.println(strArray[i]);
			}
		}
	}
}
