/*
 * a�����ó��ģ����IntClass�ǵ��ӻ��Ļ���a����ң������ͨ��a.���Է���IntClass�����ԣ�
 * s���βΣ��൱�ڷ�ң�����ĺ��ӣ���a������
 */
class IntClass {
	int value;
}
public class RunIntClass{
	public static void modifyValue(IntClass s,int val) {//һ����s��ң����������InClass
		s.value=val;     //��IntClass���value������Ϊval(ֵ���ⲿ����)
	}
	public static void main(String args[]) {
		IntClass a=new IntClass();    //����һ��IntClass�Ķ��󣬽���a����
		modifyValue(a,8);  //��a���ݸ�s�����Ұ�s�µ�value���Ը�ֵΪ8
		System.out.println(a.value); //������a����value�����value�������
	}
}
