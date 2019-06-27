import java.awt.*;
import java.awt.event.*;

class MyPanel extends Panel implements ActionListener{
	Button button1,button2;
	Color backColor;
	MyPanel(){
		button1 =new Button("确定");
		button2 =new Button("取消");
		add(button1);
		add(button2);
		setBackground(Color.pink);
		backColor=getBackground();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			setBackground(Color.CYAN);
		}
		else if(e.getSource()==button2) {
			setBackground(backColor);
		}
	}
}
class MyWindow extends Frame implements ActionListener{
	MyPanel mypanle1,mypanle2;
	Button button3;
	MyWindow(){
		setLayout(new FlowLayout());
		mypanle1=new MyPanel();
		mypanle2=new MyPanel();
		button3 =new Button("退出");
		add(mypanle1);
		add(mypanle2);
		add(button3);
		button3.addActionListener(this);
		setBounds(20,20,200,200);
		setVisible(true);
		validate();
	}
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
public class Test{
	public static void main(String args[]) {
		MyWindow mw=new MyWindow();
	}
	
}