import java.awt.*;
import java.awt.event.*;
class WindowExit extends Frame implements ActionListener    {
	MenuBar bar;
	Menu menu;
	MenuItem item;
	WindowExit()	{
		bar=new MenuBar();
		menu=new Menu("�ļ�");
		item=new MenuItem("����");//�����Ӳ˵�
		item.setShortcut(new MenuShortcut(KeyEvent.VK_E));//�����ȼ�
		item.addActionListener(this);
		bar.add(menu);
		menu.add(item);
		this.setMenuBar(bar);
		this.setBounds(100, 100, 150, 150);
		this.setVisible(true);
		this.validate();
	}
	public void actionPerformed(ActionEvent e)    { //�����˳�����
		System.exit(0);
	}
}
public class Test {
	public static void main(String[] args){
		WindowExit win=new WindowExit();
	}
}
