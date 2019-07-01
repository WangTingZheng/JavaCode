import java.awt.*;
import java.awt.event.*;
class MyPanel extends Panel{  //创建画布类
	Color backColor;
	MyPanel(){
		setBackground(Color.pink);
		backColor=getBackground();
	//	this.setBounds(100, 100, 1000, 1000);
	}
}
class WindowPanel extends Frame{//创建窗口类
	MyPanel myPanel1;
	WindowPanel(){
		setLayout(null);
		myPanel1=new MyPanel();
	//	myPanel1.setSize(100, 100);
		myPanel1.setBounds(125, 125, 100,100);
		add(myPanel1);
		setBounds(100,100,500,500);
		setVisible(true);
		validate();
	}
}
class TestRun implements ComponentListener{  //创建组件监听类
	int x,y,h,w,newx,newy,newh,neww;
	WindowPanel W;
	TestRun(){
		W=new WindowPanel();
		W.addComponentListener(this);
		x=W.getX();
		y=W.getY();
		h=W.getHeight();
		w=W.getWidth();	
	}
	public void componentResized(ComponentEvent arg0) {
		x=W.getX();
		y=W.getY();
		h=W.getHeight();
		w=W.getWidth();	
		newh=h/2;
		neww=w/2;
		newx=x+neww/2;
		newy=y+newh/2;
		W.myPanel1.setBounds((2*x+w)/4,(2*y+h)/4, neww,newh);
	}
	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class Test{
	public static void main(String[] args){
		TestRun tr=new TestRun();
	}
}
