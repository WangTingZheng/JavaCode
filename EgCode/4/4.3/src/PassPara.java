public class PassPara {
	private static int a;
	public static void main(String []args) {
		modify(a);  //我们发现，改变的只是modify方法里的形参，全局变量a并不改变
		System.out.println(a);  //所以输出的a的值是a的初始值
	}
	public static void modify(int a) {
		a++;
	}
}
