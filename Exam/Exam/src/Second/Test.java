package Second;
import java.awt.*;
import java.awt.event.*;

class MyWindow extends Frame implements ActionListener{	
	TextField text1, text2, text3;
	MyWindow(){	
		setLayout(new FlowLayout());
		text1=new TextField(8);
		text2=new TextField(8);
		text3=new TextField(15);
        add(text1);
		add(text2);
		add(text3);
		text1.addActionListener(this);
		text2.addActionListener(this);
		setBounds(100,100,150,150);
		setVisible(true);
		validate();
	}
	public void actionPerformed(ActionEvent e){
			if(e.getSource()==text1){	
				String word=text1.getText();
				if(word.equals("boy"))
	            	text3.setText("男孩");
				else if(word.equals("girl"))
					text3.setText("女孩");
				else if(word.equals("JSIE"))
					text3.setText("教院");
				else 
					text3.setText("text1中输入错误！");
			}
			else {
				String wordtwo=text2.getText();
				if(wordtwo.equals("男孩")) {
					text3.setText("boy");
				}
				else if(wordtwo.equals("女孩")) {
					text3.setText("girl");
				}
				else if(wordtwo.equals("教院")) {
					text3.setText("JSIE");
				}
				else {
					text3.setText("text1中输入错误！");
				}
			}
	}
}
public class Test {	
	public static void main(String[] args){
		MyWindow win=new MyWindow();
	}
}

