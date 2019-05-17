class TestOne{   //创建一个抽象类
	TestOne() {
		System.out.println("TestOne sucess has been done.");
	}
}
class TestTwo extends TestOne{
	TestTwo() {
		System.out.print("TestTwo sucess has been done.");
	}
}
class Son extends TestTwo{   //创建一个普通类，继承抽象类
	Son(){					//子类的构造方法里有父类的构造方法

	}
}

public class Run {
	public static void main(String args[]) {
		Son s=new Son();   //创建一个子类的对象
	}

}
