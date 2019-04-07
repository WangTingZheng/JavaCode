public class PassParaFix {
	private static int a;
	public static void main(String []args) {
		System.out.println(modify(a));
	}
	public static int modify(int a) {
		a++;
		return a;
	}
}
