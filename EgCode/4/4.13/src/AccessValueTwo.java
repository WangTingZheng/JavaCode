/*
 * ��Ҫ����value������������
 * 1.��value�����η��ĳ�static��
 * 2.����Ӧ��һ������
 */
public class AccessValueTwo {
	static int value;
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	   System.out.println(value);
	}
}
