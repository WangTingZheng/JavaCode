
public class FibonacciPlus {
	public static long fseq(int n) {
		if(n<1) return -1;    //���С��һ����������Ԫ�ز�����
		if(n==1||n==2)  return 1; //�������1��2���򷵻�1������fibonacci���й涨��
			else return fseq(n-1)+fseq(n-2);  //�������2������һ�����ǰ����֮�ͣ��ݹ�
		}
	public static void test(int t) {
		long startTime = System.currentTimeMillis();
		System.out.println(fseq(t));    //��ӡ�����
		long endTime = System.currentTimeMillis();
		System.out.println("�����"+t+"����Ҫ"+(endTime-startTime)+"ms");
	}
	public static void main(String args[]) {
		/*test(10);
		test(100);
		test(1000);
		*/
		System.out.println(fseq(99));    //��ӡ�����
		System.out.println("ok");    //��ӡ�����
		
	}

}
