package Second;
import java.awt.*;
import java.awt.event.*;
public class A {
	public static void main(String[] args) {
		Frame f = new Frame(); //ʵ����һ������
		TextField t = new TextField(); //�½�һ�������
		f.add(t);  //��������򵽴���
		t.addActionListener(new ActionListener() {//���������������
		public void actionPerformed(ActionEvent e) {
			TextField t = (TextField)e.getSource(); //�ҵ�ʱ�䷢���������
			System.out.println(t.getText()); //��ӡ���������ı�
			t.setText(null);//���������ı�
			}
		}
	);
		f.pack();//���ô��ڴ�С
		f.setVisible(true);//���ÿɼ�
	}
}
