import java.awt.*;
import java.awt.event.*;
class myFrame extends Frame implements ActionListener{ //��������
	TextField t1,t2;
	myFrame(){
		t1=new TextField(20);
		t2=new TextField(20);
		
		this.add(t1, BorderLayout.SOUTH);
		this.add(t2, BorderLayout.NORTH);
		t1.addActionListener(this);
		t2.addActionListener(this);
		setBounds(100, 100, 300, 200);
		setVisible(true);  
	}
	public void actionPerformed(ActionEvent e) {
		String Text;
		if(e.getSource()==t1) {  //���t1�ı��������ݸı�
			Text=t1.getText();//��ȡ���������
			t2.setText(Text);//��t2����ʾ
		}
		else if(e.getSource()==t2) {
			t2.setText("");
		}
	}
}
public class Test {
	public static void main(String args[]) {
		myFrame mf=new myFrame();
	}
}
