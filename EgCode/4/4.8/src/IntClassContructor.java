/*
 * ���췽������������ͬ�ķ���
 */
class IntClass{
	int value;
	//�˴���IntClassΪ���췽�������췽�������࣬�������κζ���
	public IntClass (int val) { 
			value=val;
	}
}
public class IntClassContructor{
	public static IntClass getInstance() {
		//�˴����ù��췽��
		IntClass s=new IntClass(8);
		//s.value
		return s;
	}
	public static void main(String args[]) {
		IntClass a= getInstance();
		System.out.println(a.value);
	}
}

