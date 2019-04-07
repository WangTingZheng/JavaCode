public class PassParaFixTwo {
	private static int a;
	public static void main(String []args) {
		modify();
		System.out.println(a);
	}
	public static void modify() {
		a++;
	}
}
