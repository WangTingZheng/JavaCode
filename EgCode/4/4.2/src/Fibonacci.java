/*
 * ������дӵ�3�ʼ��ÿһ�����ǰ����֮��
 */
public class Fibonacci {
	public static int fseq(int n) {
		if(n<1) return -1;    //���С��һ����������Ԫ�ز�����
		if(n==1||n==2)  return 1; //�������1��2���򷵻�1������fibonacci���й涨��
			else return fseq(n-1)+fseq(n-2);  //�������2������һ�����ǰ����֮�ͣ��ݹ�
		}
	public static void main(String args[]) {
		System.out.print(fseq(10));    //��ӡ�����
	}
}
