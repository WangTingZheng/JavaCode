/*
 * ������дӵ�3�ʼ��ÿһ�����ǰ����֮��
 */
public class Fibonacci {
	public static long fseq(int n) {
		if(n<1) return -1;    //���С��һ����������Ԫ�ز�����
		if(n==1||n==2)  return 1; //�������1��2���򷵻�1������fibonacci���й涨��
			else return fseq(n-1)+fseq(n-2);  //�������2������һ�����ǰ����֮�ͣ��ݹ�
		}
	public static void main(String args[]) {
		for(int x=3;x<50;x++) {
			long startTime = System.currentTimeMillis();
			System.out.print("x="+x+",���="+fseq(x));    //��ӡ�����
			long endTime = System.currentTimeMillis();
			System.out.println("��ʱ"+(endTime-startTime)+"����");
		}
		System.out.println("ok");    //��ӡ�����
	}
}
