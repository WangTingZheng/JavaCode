import java.awt.*;
import java.awt.event.*;
class getW{  //�����Ļ�Ŀ�͸�
	int width;
	int height;
	getW(){
		Dimension   screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
		width= (int)screensize.getWidth();
		height= (int)screensize.getHeight();
	}
	
}
class MyFrame extends Frame {
	MenuBar mb;
	Menu m;
	MenuItem item1,item2;
	Dimension dim;
	MyFrame(String s,int x,int y){ //�������ڣ�s�Ǳ��⣬xy������
		setTitle(s);
		Toolkit tk=getToolkit();
		dim=tk.getScreenSize();
		setBounds(x,y,dim.width/4,dim.height/4);
		mb=new MenuBar();
		m=new Menu("�ļ�");
		item1=new MenuItem("��");
		item2=new MenuItem("����");
		m.add(item1);
		m.add(item2);
		mb.add(m);
		setMenuBar(mb);
		setVisible(true);    
	}
}
public class Test {
	public static void main(String[] args){  
		getW W=new getW();

		MyFrame mf1=new MyFrame("����",0,0); //���ϵ����������0��0
		MyFrame mf2=new MyFrame("����",W.width,0);  //���ϵĺ�����Ϊ��Ļ���
		MyFrame mf3=new MyFrame("����",0,W.height); //���½ǵ�������Ϊ��Ļ�߶�
		MyFrame mf4=new MyFrame("����",W.width,W.height); //�Ȼ�һ�������
		mf4=new MyFrame("����",(W.width-mf4.getY()),(W.height-mf4.getX())); //�޸Ĳ����ô��ڵ�����
	}

}
