import java.awt.*;
import java.awt.event.*;
class MyWindow extends Frame implements ActionListener{
	Panel p;
	ScrollPane sp2;
	Button btn;
	TextField t1,t2;
	Dimension n;
	int s1,s2;
	MyWindow(){
		setLayout(new FlowLayout());
		p=new Panel();
		sp2=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS); //设置滚轮

		t2=new TextField(20);
		p.add(new Button("one"));
		p.add(new Button("two"));
		p.add(new Button("three")); 
		btn=new Button("four");
		p.add(btn);
		btn.addActionListener(this);

		add(t2);
		add(sp2);
		n=sp2.getMaximumSize();
		t2.setText("height:"+n.height+" width:"+n.width);//获取最大范围并输出
		setBounds(60, 60, 200, 200);
		setVisible(true);
		validate();      
	}
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
}
public class Test {
	public static void main(String[] args){
		new MyWindow();
	}
}
