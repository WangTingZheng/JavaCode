
public class StaticCodeBlockTwo {
	static int value;
	StaticCodeBlockTwo(){
		//�˴��ǹ��췽��
		System.out.println("ֻҪ���û��Թ��췽�����ж�������ʱ�����췽���Ż�����һ�Ρ�");
	}
	static {
		//�˴�Ϊ��̬�����
		value =3;
		System.out.println("���౻ת��ʱ����̬�����ͱ�ִ��һ�Σ�ֻ��һ��");
		System.out.println("value="+value);
	}
	public static void main(String []args) {
		//��ִ�о�̬�����
		StaticCodeBlockTwo t=new StaticCodeBlockTwo();//��ִ�й��췽��
	}
}
