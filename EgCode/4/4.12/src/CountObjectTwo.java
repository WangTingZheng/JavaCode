
public class CountObjectTwo {
	private static int i=0;
	CountObjectTwo(){
		i++;
	}
	public int getI() {
		return i;
	};
	public static void main(String args[]) {
	//CountObject����CountObject�Ĺ��췽��
		CountObject t=null;
		for(int j=0;j<9;j++) {
			t = new CountObject();
		}
		System.out.println(t.getI());//�����t�������������getI()���������������ȷʵ��2
	}
}
