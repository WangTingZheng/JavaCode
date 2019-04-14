/*
 * 构造方法有隐含的返回值，由系统调用，不能自定义
 * 如果用户自定义了返回值，就不构成构造方法
 * 构造方法在new的时候最先被执行
 * 如果用户没有添加构造方法，系统会自动创建一个空的构造方法，该
 * 构造方法修饰符与类的修饰符保持一致
 */
public class A {
	//此处由于给A定义了返回值void，故不是构造方法
	    void A(){
		System.out.println("Class A");
	}
	 public static void main(String[] args) {
		 //由于A不是构造方法，所以new的时候不被执行
		new A();
	}
}

/*
 * 如果我们去掉void，把A还原成构造方法
public class A {
		A(){
		System.out.println("Class A");
	}
	public static void main(String[] args) {
	    //我们new的时候A就会被执行
		new A();
	}
}
*/