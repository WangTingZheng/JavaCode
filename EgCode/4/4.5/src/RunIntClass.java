class IntClass{
	int value;
}
public class RunIntClass {
	public static IntClass getInstance() {  
		IntClass s= new IntClass();  //�ڷ���������һ��IntClass����
		s.value=8;    			     //�������������Ը�ֵ
		return s;					 //�����������
	}
	public static void main(String args[]) {
		IntClass a;                  //a��һ���������������洴���Ķ���
		a = getInstance();			 // ��getInstance���صĶ������a���������
		System.out.print(a.value);   //��ӡ��value�������
	}
}
