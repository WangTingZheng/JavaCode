/*
 * arg������Ҫ�ⲿ����
 */
public class ArgsPass{
	public static void printArray(String[] arg) {
		for(int i=0;i<arg.length;i++)  //���ǿ���ͨ�����������length��������ȡ����
		{System.out.println(arg[i]);}  //�����ӡ�����ÿһ��Ԫ��
	}
		public static void main(String []args) {
			printArray(args);        //ִ�и÷���
		}
}
