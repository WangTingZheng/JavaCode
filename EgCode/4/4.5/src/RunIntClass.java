class IntClass{
	int value;
}
public class RunIntClass {
	public static IntClass getInstance() {  
		IntClass s= new IntClass();  //在方法中引用一个IntClass对象
		s.value=8;    			     //给这个对象的属性赋值
		return s;					 //返回这个对象
	}
	public static void main(String args[]) {
		IntClass a;                  //a是一个容器，用来储存创建的对象
		a = getInstance();			 // 把getInstance返回的对象放在a这个容器里
		System.out.print(a.value);   //打印出value这个属性
	}
}
