public class TestForKABCABCA {
	//���KABCABCA
		static boolean foo(char c) {	//���һ���ַ�������ֵ
			System.out.println(c);
			return true;                 //�ɹ��Ļ����true
		}
		public static void main(String[] argv) {
			int i=0;
			for(foo('K');foo('A')&&(i<2);foo('C')) {
				i++;
				foo('B');
			}
		}
}
