/*
 * a是引用出的，如果IntClass是电视机的话，a就是遥控器，通过a.可以访问IntClass的属性，
 * s是形参，相当于放遥控器的盒子，与a有区别
 */
class IntClass {
	int value;
}
public class RunIntClass{
	public static void modifyValue(IntClass s,int val) {//一个叫s的遥控器，控制InClass
		s.value=val;     //把IntClass里的value属性设为val(值由外部传递)
	}
	public static void main(String args[]) {
		IntClass a=new IntClass();    //创立一个IntClass的对象，交由a控制
		modifyValue(a,8);  //把a传递给s，并且把s下的value属性赋值为8
		System.out.println(a.value); //重新由a控制value，输出value这个属性
	}
}
