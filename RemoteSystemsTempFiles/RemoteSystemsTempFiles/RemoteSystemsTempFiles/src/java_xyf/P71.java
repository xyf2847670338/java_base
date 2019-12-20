package java_xyf;

public class P71 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] a= {9,8,3,5,2};
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+"");}
		System.out.println();
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length -i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("\n冒号排序结束后数组各个元素是：");
		for(int xiaoa:a) 
			System.out.print(xiaoa+"");
}
}
