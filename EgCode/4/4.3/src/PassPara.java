public class PassPara {
	private static int a;
	public static void main(String []args) {
		modify(a);  //���Ƿ��֣��ı��ֻ��modify��������βΣ�ȫ�ֱ���a�����ı�
		System.out.println(a);  //���������a��ֵ��a�ĳ�ʼֵ
	}
	public static void modify(int a) {
		a++;
	}
}
