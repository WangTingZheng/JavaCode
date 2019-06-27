package ActionEvent;
import java.awt.*;
import java.awt.event.*;
class YourWindow extends Frame implements ActionListener{
	TextField text1, text2;
	PoliceMan police;
	YourWindow(){
		setLayout(new FlowLayout());
		text1=new TextField(20); //�����ı���1
		text2=new TextField(20); //�����ı���2
		police=new PoliceMan();  //����������
		add(text1);      //�����ı���1
		add(text2);		 //�����ı���2
		text1.addActionListener(this); //���ı���1�Ӽ�����
		text2.addActionListener(police); //���ı���2�Ӽ�����
		setBounds(100,100,200,200);   //���ô��ڴ�С
		setVisible(true);   //���ÿɼ�
		validate();  //ִ��
	}
	public void actionPerformed(ActionEvent e){  //����ļ�����
		String number=e.getActionCommand();  //ȡ���ı��������
		if("".equals(number)||number==null)
		return;
		int n=Integer.parseInt(number);//���ַ���ת��int��
		int m=n*n; //���n��ƽ��
		text2.setText(n+"��ƽ���ǣ�"+m);//��ʾ��ƽ��
	}
}
class PoliceMan implements ActionListener{
	public void actionPerformed(ActionEvent e){  
		String number=e.getActionCommand();  //ȡ���ı��������
		if("".equals(number)||number==null)  //
			return;
		int n=Integer.parseInt(number);  //
		int m=n*n*n;   //��n�����η�
		System.out.println(n+"�������ǣ�"+m);//��console���ӡ�����Ľ��
	} 
}
public class Test{
	public static void main(String[] args){
		YourWindow win=new YourWindow();
	}
}



