public class StaticCodeBlock {
	static int value;
	static {
		//此处为静态代码块
		value =3;
		System.out.println("当类被转载时，静态代码块就被执行一次，只有一次");
		System.out.println("value="+value);
	}
	public static void main(String []args) {
		//先执行静态代码块
	}
}
