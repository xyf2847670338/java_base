package ������;

class BlcException extends Exception{

	public BlcException() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public BlcException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}
public class E32 {
	public static int divide(int x,int y)throws  BlcException{
		if(y==0) {
			throw new BlcException("������0");
		}
		int result=x/y;
		return result;
	}
	public static void main(String[] args) {
		try {
			int result=divide(4,0);
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("������쳣��ϢΪ:"+e.getMessage());
		}
	}
}
