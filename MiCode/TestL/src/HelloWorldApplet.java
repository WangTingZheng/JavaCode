import java.awt.*;
import java.applet.*;
/**
 * Title:这是一个演示程序<br>
 * Description:用于说明Applet程序的典型特征<br>
 * @author Engou
 * @version 1.0
 * */
public class HelloWorldApplet extends Applet{
	/** 初始化*/
	public void init(){
	}
	/**用于绘制界面
	 * @param g 为内部对象
	 */
	public void paint(Graphics g) {
		g.drawString("Hello World!", 25, 25);
	}
}
