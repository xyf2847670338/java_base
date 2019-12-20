package java_xyf;

public class Danxunhuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] yb= {"管理学院","教育学院","设计学院","音乐学院","演艺学院","中专部"};
			/*
			 * 0 1 2 3 4 5
			 * 第一轮：
			 * 0 5 1 4 2 3
			 * 第二轮
			 * 第一支队伍不动，最后一支队伍移到第一支队伍后面，其他队伍瞬移
			 * 0 5 1 2 3 4
			 * 0 4 5 3 1 2
			 * 第三轮
			 * 第一支队伍不动，最后一支队伍移到第一支队伍后面，其他队伍瞬移
			 * 0 4 5 1 2 3
			 * 0 3 4 2 5 1
			 * 第四轮
			 * 第一支队伍不动，最后一支队伍移到第一支队伍后面，其他队伍瞬移
			 * 0 3 4 5 1 2
			 * 0 2 3 1 4 5
			 * 第五轮
			 * 第一支队伍不动，最后一支队伍移到第一支队伍后面，其他队伍瞬移
			 * 0 2 3 4 5 1
			 * 0 1 2 5 4 3
			 * */
		for(int i=1;i<yb.length;i++) {
			System.out.println("第"+i+"天:");
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
