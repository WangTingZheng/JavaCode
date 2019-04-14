/*
 * 构造方法：与类名相同的方法
 */
class IntClass{
	int value;
	//此处的IntClass为构造方法，构造方法属于类，不属于任何对象
	public IntClass (int val) { 
			value=val;
	}
}
public class IntClassContructor{
	public static IntClass getInstance() {
		//此处调用构造方法
		IntClass s=new IntClass(8);
		//s.value
		return s;
	}
	public static void main(String args[]) {
		IntClass a= getInstance();
		System.out.println(a.value);
	}
}

