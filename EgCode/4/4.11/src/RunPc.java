/*
 * static 修饰的域变量存在类的内存区，可以
 * 通过对象应用来访问，访问的格式是类名.域名
 * 该变量可以被多个类所引用
 */
import java.awt.*;
import java.applet.*;
class Pc{
	//在Pc这个类里定义一个static的变量存到内存区
	static double ad=8;
}
public class RunPc extends Applet{
	public void paint(Graphics g) {
		//通过对象引用出两个对象
		Pc m=new Pc();
		Pc m1=new Pc();
		m.ad=0.1;//通过第一个类名m来修改ad的值
		g.drawString("m1="+m1.ad,20,50);//用m1这个对象显示ad的值
		g.drawString("Pc="+Pc.ad,20,70);//用Pc这个类来显示ad的值
		g.drawString("m="+m.ad,20,90);//用m这个对象显示ad的值
	}
}
//最后发现都一样