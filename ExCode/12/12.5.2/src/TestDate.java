import java.util.*;
import java.awt.*;
import java.awt.event.*;

class getDate{  //获取时间
	public String GetDate() {
		 Date date = new Date(); //用这个对象
		 return  date.toString();//返回时间
	}
}
class MyButton extends Button implements ActionListener{
	String name;
	TextField text;
	Container con;
	MyButton(String name, Container con){
	super(name);
	this.con=con;
	text=new TextField(8);
	text.addActionListener(this);//
	this.addActionListener(this);
	con.add(text);
	con.add(this);
	}
	public void actionPerformed(ActionEvent e){
			name=text.getText();
			this.setLabel(name);
			con.validate();
	}
}
class Window extends Frame implements ActionListener{ //创建窗口
	MyButton btn;
	TextField texttime;
	Window(){
		setLayout(new FlowLayout());
		btn=new MyButton("ok",this);
		Button btn1=new Button("time");
		texttime=new TextField(25);
		add(btn1);
		add(texttime);
		btn1.addActionListener(this);
		setBounds(100, 100, 200, 200);
		setVisible(true);
		validate();
	}
	public void actionPerformed(ActionEvent e) { 
		// TODO Auto-generated method stub
		getDate gd=new getDate();//如果time按钮被点击了
		texttime.setText(gd.GetDate());//设置文本框内容为时间
	}
}
public  class TestDate{
	public static void main(String args[]) {
	      Window w=new Window();
	   }
}