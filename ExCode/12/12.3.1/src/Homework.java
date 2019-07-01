import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{ //产生窗口
	TextField tInputC,tInputN,tFont;
	MyFrame(){
		setLayout(new FlowLayout());
		tInputC=new TextField(10); //加入文本框
		tInputN=new TextField(10);
		tFont=new TextField(10);
		add(tInputC);
		add(tInputN);
		add(tFont);
		tInputC.addActionListener(this); //监听文本框
		tInputN.addActionListener(this);
		tFont.setText("test");
		setBounds(100, 100, 200, 150);     //set windows size
		setVisible(true);                   //set windows visible
		validate();     
	}
	//设置文本框的文字格式
	public void setTextS(TextField tf,Font f,String name,int style,int size,Color color,Boolean enhance,Boolean italic){
		if(enhance&&!italic) //设置类型
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
		tf.setFont(f);//把字体加入到文本框
		tf.setForeground(color);//设置文本框颜色
		tFont.setText("test");//设置内容
	}
	@Override
	public void actionPerformed(ActionEvent e) { //监听输入文本框内容
		// TODO Auto-generated method stub
		String tsTc = tInputC.getText();
		String tsIn = tInputN.getText();
		Font x=null;      //通过修改各个值来改变
		String namex="宋体";
		int stylex=0;
		int sizex=10;
		Color colorx=Color.black;
		Boolean enhancex=false;
		Boolean italicx=false;
		if(e.getSource()==tInputC) {
			if(tsTc=="字体") {
				namex=tInputN.getText();
			}
			else if(tsTc=="类型") {
				if(tInputN.getText()=="普通") {
					stylex=Font.PLAIN;
				}
				else if(tInputN.getText()=="斜体") {
					stylex=Font.PLAIN|stylex;
				}
				else if(tInputN.getText()=="加粗") {
					stylex=Font.BOLD|stylex;
				}
			}
			else if(tsTc=="字号") {
				sizex=Integer.valueOf(tInputN.getText()).intValue();
			}
			else if(tsTc=="颜色") {
				if(tInputN.getText()=="Black") {
					colorx=Color.black;
				}
				else if(tInputN.getText()=="Blue") {
					colorx=Color.BLUE;
				}
			}
		}
		setTextS(tFont,x,namex,stylex,sizex,colorx,enhancex,italicx); //改变字体
	}
}
public class Homework {
	public static void main(String args[]) {
		MyFrame f=new MyFrame();
	}
}
