/*
 * value��Ȼ��AccessValue�Ķ��󣬵��ǲ���static�ģ���main����һ���ռ��
 * mainû�취ֱ�ӷ���value�����������ע��ȥ�ˣ�ע�����ͻᱨ��
 * ��Ҫ����value������������
 * 1.��value�����η��ĳ�static��
 * 2.����Ӧ��һ������
 */
public class AccessValue {
    int value;
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	   // System.out.println(value);
	}
}
