public class PassParaFix {
	private static int a;
	public static void main(String []args) {
		System.out.println(modify(a));//ֱ�Ӵ�ӡ����ֵ���ܵõ��ı��ֵ��
	}
	public static int modify(int a) { //�����޸�������Ϊmodify��������˷���ֵ
		a++;
		return a;
	}
}
