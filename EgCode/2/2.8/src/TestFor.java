public class TestFor {
	static boolean foo(char c) {	//输出一个字符变量的值
		System.out.println(c);
		return true;                 //成功的话输出true
	}
	public static void main(String[] argv) {
		int i=0;
		for(foo('A');foo('B')&&(i<2);foo('C')) {
			i++;
			foo('D');
		}
	}
}

