import java.awt.*;
import java.applet.*;
/**
 * Title:����һ����ʾ����<br>
 * Description:����˵��Applet����ĵ�������<br>
 * @author Engou
 * @version 1.0
 * */
public class HelloWorldApplet extends Applet{
	/** ��ʼ��*/
	public void init(){
	}
	/**���ڻ��ƽ���
	 * @param g Ϊ�ڲ�����
	 */
	public void paint(Graphics g) {
		g.drawString("Hello World!", 25, 25);
	}
}
