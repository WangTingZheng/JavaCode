public class PassParaFixTwo {
	private static int a;
	public static void main(String []args) {
		modify();
		System.out.println(a);  //��������Ľ����Ȼ���иı�
	}
	public static void modify() { //����һ�ַ�����ֱ��ȥ���βΣ�����modify��ֻ��ı�ȫ�ֱ���
		a++;
	}
}
