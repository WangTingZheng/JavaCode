/*
 * ���췽���������ķ���ֵ����ϵͳ���ã������Զ���
 * ����û��Զ����˷���ֵ���Ͳ����ɹ��췽��
 * ���췽����new��ʱ�����ȱ�ִ��
 * ����û�û����ӹ��췽����ϵͳ���Զ�����һ���յĹ��췽������
 * ���췽�����η���������η�����һ��
 */
public class A {
	//�˴����ڸ�A�����˷���ֵvoid���ʲ��ǹ��췽��
	    void A(){
		System.out.println("Class A");
	}
	 public static void main(String[] args) {
		 //����A���ǹ��췽��������new��ʱ�򲻱�ִ��
		new A();
	}
}

/*
 * �������ȥ��void����A��ԭ�ɹ��췽��
public class A {
		A(){
		System.out.println("Class A");
	}
	public static void main(String[] args) {
	    //����new��ʱ��A�ͻᱻִ��
		new A();
	}
}
*/