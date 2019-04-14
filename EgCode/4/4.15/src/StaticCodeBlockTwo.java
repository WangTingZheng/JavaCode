
public class StaticCodeBlockTwo {
	static int value;
	StaticCodeBlockTwo(){
		//此处是构造方法
		System.out.println("只要当用户对构造方法进行对象引用时，构造方法才会运行一次。");
	}
	static {
		//此处为静态代码块
		value =3;
		System.out.println("当类被转载时，静态代码块就被执行一次，只有一次");
		System.out.println("value="+value);
	}
	public static void main(String []args) {
		//先执行静态代码块
		StaticCodeBlockTwo t=new StaticCodeBlockTwo();//在执行构造方法
	}
}
