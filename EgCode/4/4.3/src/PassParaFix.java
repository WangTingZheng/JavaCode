public class PassParaFix {
	private static int a;
	public static void main(String []args) {
		System.out.println(modify(a));//直接打印返回值就能得到改变的值了
	}
	public static int modify(int a) { //经过修复后，我们为modify方法添加了返回值
		a++;
		return a;
	}
}
