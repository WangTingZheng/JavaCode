
public class CountObject {
	private static int i=0;
	CountObject(){
		i++;
	}
	public int getI() {
		return i;
	};
	public static void main(String args[]) {
		//CountObject����CountObject�Ĺ��췽��
		CountObject t=new CountObject();  //new������췽�������ͱ�ִ��һ�Σ�i���1������tָ���������
		t = new CountObject();//�ٴ�new������췽������ִ��һ�Σ�i���2��t������ԭ������Ĺ�ϵ������ָ������µĶ���
		System.out.println(t.getI());//�����t�������������getI()���������������ȷʵ��2
	}
}
/*

}*/
