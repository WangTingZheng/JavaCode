/*
 * ������˼·�ǣ�һ��һ������ÿ�ƽ�һ�����Ͱ�֮ǰ���������ˣ�ֱ�������յ�
 * ʱ�临�Ӷ�Ϊn��ֻʹ����3���������ռ临�Ӷȴ����˥��
 */
public class FibonacciPrimer {
	public static void display(int n) {
		long a,b,temp;
		a=b=temp=1;
		if(n<3) System.out.print("��"+n+"���ǣ�"+1);
		for(int i=1;i<=n-2;i++) {
			temp= a+b;
			a=b;
			b=temp;
		}
		System.out.print("��"+n+"���ǣ�"+temp);
	}
	public static void main(String args[]) {
		display(1000);
	}
}