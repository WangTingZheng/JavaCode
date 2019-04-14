class IntClass{
	//该类没有构造方法，系统将自动新建一个构造方法
	int value;
}
public class RunClassDefault {
	public static IntClass getInstance() {
		IntClass s= new IntClass();
		s.value =8;
		return s;
	}
	public static void main(String args[]) {
	IntClass a=getInstance();
	System.out.println(a.value);
	}
}
