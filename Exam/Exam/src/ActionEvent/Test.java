package ActionEvent;
import java.awt.*;
import java.awt.event.*;
class YourWindow extends Frame implements ActionListener{
	TextField text1, text2;
	PoliceMan police;
	YourWindow(){
		setLayout(new FlowLayout());
		text1=new TextField(20); //创建文本框1
		text2=new TextField(20); //创建文本框2
		police=new PoliceMan();  //创建监听器
		add(text1);      //加入文本框1
		add(text2);		 //加入文本框2
		text1.addActionListener(this); //给文本框1加监听器
		text2.addActionListener(police); //给文本框2加监听器
		setBounds(100,100,200,200);   //设置窗口大小
		setVisible(true);   //设置可见
		validate();  //执行
	}
	public void actionPerformed(ActionEvent e){  //本类的监听器
		String number=e.getActionCommand();  //取出文本框的内容
		if("".equals(number)||number==null)
		return;
		int n=Integer.parseInt(number);//把字符型转成int型
		int m=n*n; //算出n的平方
		text2.setText(n+"的平方是："+m);//显示出平方
	}
}
class PoliceMan implements ActionListener{
	public void actionPerformed(ActionEvent e){  
		String number=e.getActionCommand();  //取出文本框的内容
		if("".equals(number)||number==null)  //
			return;
		int n=Integer.parseInt(number);  //
		int m=n*n*n;   //求n的三次方
		System.out.println(n+"的立方是："+m);//在console里打印立方的结果
	} 
}
public class Test{
	public static void main(String[] args){
		YourWindow win=new YourWindow();
	}
}



