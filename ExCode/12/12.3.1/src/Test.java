import java.awt.*;
class WindowText extends Frame{
	TextField text1, text2;
	WindowText(String s){
		super(s);                         
		setLayout(new FlowLayout());
		Frame f=new Frame();
		MenuBar bar=new MenuBar();
		f.setMenuBar(bar);
		Menu m1,m2,m3;		
		text1=new TextField("输入密码", 10); //create a text to tell users enter the password
		text1.setEditable(false);            //set textField uneditable
		text2=new TextField(10);            //create a text to get password
		text2.setEchoChar('*');             //set the char which comes back when you enter a char
		add(text1);							//add text1
		add(text2);						   //add text2
		setBounds(100, 100, 200, 150);     //set windows size
		setVisible(true);                   //set windows visible
		validate();                        //confirm
	}
}
public class Test{	
	public static void main(String[] args)	{
		WindowText win=new WindowText("添加了文本的窗口");
	}
}