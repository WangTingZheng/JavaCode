import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{ //��������
	TextField tInputC,tInputN,tFont;
	MyFrame(){
		setLayout(new FlowLayout());
		tInputC=new TextField(10); //�����ı���
		tInputN=new TextField(10);
		tFont=new TextField(10);
		add(tInputC);
		add(tInputN);
		add(tFont);
		tInputC.addActionListener(this); //�����ı���
		tInputN.addActionListener(this);
		tFont.setText("test");
		setBounds(100, 100, 200, 150);     //set windows size
		setVisible(true);                   //set windows visible
		validate();     
	}
	//�����ı�������ָ�ʽ
	public void setTextS(TextField tf,Font f,String name,int style,int size,Color color,Boolean enhance,Boolean italic){
		if(enhance&&!italic) //��������
		f=new Font(name,style|Font.BOLD,size);
		else if(!enhance&&italic) {
			f=new Font(name,style|Font.ITALIC,size);
		}
		else if(enhance&&italic) {
			f=new Font(name,style|Font.BOLD|Font.ITALIC,size);
		}
		else {
			f=new Font(name,style,size);
		}
		tf.setFont(f);//��������뵽�ı���
		tf.setForeground(color);//�����ı�����ɫ
		tFont.setText("test");//��������
	}
	@Override
	public void actionPerformed(ActionEvent e) { //���������ı�������
		// TODO Auto-generated method stub
		String tsTc = tInputC.getText();
		String tsIn = tInputN.getText();
		Font x=null;      //ͨ���޸ĸ���ֵ���ı�
		String namex="����";
		int stylex=0;
		int sizex=10;
		Color colorx=Color.black;
		Boolean enhancex=false;
		Boolean italicx=false;
		if(e.getSource()==tInputC) {
			if(tsTc=="����") {
				namex=tInputN.getText();
			}
			else if(tsTc=="����") {
				if(tInputN.getText()=="��ͨ") {
					stylex=Font.PLAIN;
				}
				else if(tInputN.getText()=="б��") {
					stylex=Font.PLAIN|stylex;
				}
				else if(tInputN.getText()=="�Ӵ�") {
					stylex=Font.BOLD|stylex;
				}
			}
			else if(tsTc=="�ֺ�") {
				sizex=Integer.valueOf(tInputN.getText()).intValue();
			}
			else if(tsTc=="��ɫ") {
				if(tInputN.getText()=="Black") {
					colorx=Color.black;
				}
				else if(tInputN.getText()=="Blue") {
					colorx=Color.BLUE;
				}
			}
		}
		setTextS(tFont,x,namex,stylex,sizex,colorx,enhancex,italicx); //�ı�����
	}
}
public class Homework {
	public static void main(String args[]) {
		MyFrame f=new MyFrame();
	}
}
