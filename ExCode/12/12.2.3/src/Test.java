import java.awt.*;
import java.awt.event.*;
class getW{  //获得屏幕的宽和高
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
	MyFrame(String s,int x,int y){ //创建窗口，s是标题，xy是坐标
		setTitle(s);
		Toolkit tk=getToolkit();
		dim=tk.getScreenSize();
		setBounds(x,y,dim.width/4,dim.height/4);
		mb=new MenuBar();
		m=new Menu("文件");
		item1=new MenuItem("打开");
		item2=new MenuItem("保存");
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

		MyFrame mf1=new MyFrame("左上",0,0); //左上的坐标起点是0，0
		MyFrame mf2=new MyFrame("右上",W.width,0);  //右上的横坐标为屏幕宽度
		MyFrame mf3=new MyFrame("左下",0,W.height); //左下角的纵坐标为屏幕高度
		MyFrame mf4=new MyFrame("右下",W.width,W.height); //先画一个外面的
		mf4=new MyFrame("右下",(W.width-mf4.getY()),(W.height-mf4.getX())); //修改参数让窗口到里面
	}

}
