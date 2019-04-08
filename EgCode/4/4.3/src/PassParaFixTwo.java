public class PassParaFixTwo {
	private static int a;
	public static void main(String []args) {
		modify();
		System.out.println(a);  //这样输出的结果当然会有改变
	}
	public static void modify() { //还有一种方法是直接去掉形参，这样modify就只会改变全局变量
		a++;
	}
}
