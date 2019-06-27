package Second;
import java.awt.*;
import java.awt.event.*;
public class A {
	public static void main(String[] args) {
		Frame f = new Frame(); //实例化一个窗口
		TextField t = new TextField(); //新建一个输入框
		f.add(t);  //加入输入框到窗口
		t.addActionListener(new ActionListener() {//给输入框加入监听器
		public void actionPerformed(ActionEvent e) {
			TextField t = (TextField)e.getSource(); //找到时间发生的输入框
			System.out.println(t.getText()); //打印出输入框的文本
			t.setText(null);//清除输入框文本
			}
		}
	);
		f.pack();//设置窗口大小
		f.setVisible(true);//设置可见
	}
}
