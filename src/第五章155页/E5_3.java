package ������155ҳ;

public class E5_3 {
	public static void main(String[] args) {
		String str="Java1a7b6c8d3e9f6g0h4ij4l9m���ܵ�";
		char[]charArray=str.toCharArray();
		System.out.print("���ַ���תΪ�ַ������ƫ�����:");
		for (int i=0;i<charArray.length;i++) {
			if (i !=charArray.length -1) {
				System.out.print(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.print("\n�ַ����е�������:");
		for(char zf:charArray) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		System.out.print("\n�ַ����еĺ�����:");
		for(char zf:charArray) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
		}
		}
		System.out.println("��intֵת��ΪString����֮��Ľ��:"+String.valueOf(12));
		System.out.println("���ַ���ת���ɴ�д֮��Ľ��:"+str.toUpperCase());
	}
}
	
