import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class Listener implements ActionListener{   
	private myApplet mya;  //myApplet��������
    //ͨ�����췽���õ�myApplet���������
	public Listener(myApplet a){this.mya = a;}
	public void actionPerformed(ActionEvent e)
	{        //�ı�myApplet���������d������ 
		mya.d=Double.valueOf(mya.input.getText()).doubleValue();
		//����myApplet����refresh()����ˢ�� 
		mya.refresh();	  	
	}   
};
public class myApplet extends Applet{
	public TextField input; //�޸�Ϊpublic
	public double d=0.0;    //�޸�Ϊpublic
    public void init(){  	
    	input = new TextField(10);               
		add(input); 
		//input������߽������ù�ϵ
		input.addActionListener(new Listener(this));
	}
    public void paint(Graphics g){
    	g.drawString("������������"+d,10,50);
    }
         //����ˢ�·�������ˢ��
    public void refresh(){
        repaint();
    }	
}
