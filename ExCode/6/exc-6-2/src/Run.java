class AA{
	AA(){
		this(1);
		System.out.println("A Zero");
	}
	AA(int x){
		this(1,2);
		System.out.println("A One");
	}
	AA(int x,int y){
		System.out.println("A Two");
	}
}
class A extends AA{
	A(){
		this(1);                       //跳到第二个构造方法
		System.out.println("A Zero");  //利用子类构造方法自带父类构造方法的特性调用父类的构造方法
	}
	A(int x){					
		this(x,1);						//跳到第三个构造方法
		System.out.println("A One");    //执行完后执行这一条
	}
	A(int x,int y){                    
		System.out.println("A Two");
	}
}

public class Run {
	public static void main(String args[]) {
		A a=new A();  //实例化A对象，执行A的第一个构造方法
	}
}
