import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class myApplet extends Applet implements KeyListener 
{
	private TextField input;
	private double d=0.0;
         /**  
    ���г�ʼ���������������󣬼��������
     */
public void init()
{
  	input = new TextField(10);
	//myApplet��������input�����������addʹinputǶ������
	add(input); 
	input.addKeyListener(this);
}
public void paint(Graphics g)
{
  	g.drawString("������������"+d,10,50);
}
public void keyPressed(KeyEvent e) 
{} 
public void keyReleased(KeyEvent e) 
{	 //���ȵõ�Double��Ķ���֮����ö��󷽷�doubleValue�õ�ֵ
	d=Double.valueOf(input.getText()).doubleValue();
	//����ˢ�£�����paint()����
  	repaint();	}
public void keyTyped(KeyEvent e)  
{}	}
