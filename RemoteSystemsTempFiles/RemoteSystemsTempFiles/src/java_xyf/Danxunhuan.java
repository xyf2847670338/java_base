package java_xyf;

public class Danxunhuan {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String[] yb= {"����ѧԺ","����ѧԺ","���ѧԺ","����ѧԺ","����ѧԺ","��ר��"};
			/*
			 * 0 1 2 3 4 5
			 * ��һ�֣�
			 * 0 5 1 4 2 3
			 * �ڶ���
			 * ��һ֧���鲻�������һ֧�����Ƶ���һ֧������棬��������˲��
			 * 0 5 1 2 3 4
			 * 0 4 5 3 1 2
			 * ������
			 * ��һ֧���鲻�������һ֧�����Ƶ���һ֧������棬��������˲��
			 * 0 4 5 1 2 3
			 * 0 3 4 2 5 1
			 * ������
			 * ��һ֧���鲻�������һ֧�����Ƶ���һ֧������棬��������˲��
			 * 0 3 4 5 1 2
			 * 0 2 3 1 4 5
			 * ������
			 * ��һ֧���鲻�������һ֧�����Ƶ���һ֧������棬��������˲��
			 * 0 2 3 4 5 1
			 * 0 1 2 5 4 3
			 * */
		for(int i=1;i<yb.length;i++) {
			System.out.println("��"+i+"��:");
			if(i>1) {
				String stemp=yb[yb.length-1];
				for (int k=yb.length-1;k>1;k--) {
					yb[k]=yb[k-1];
				}
				yb[1]=stemp;
			}
			for(int j=0;j<yb.length/2;j++) {
				System.out.println(yb[j]+"vs"+yb[yb.length-j-1]);
			}
		}
	}
}
