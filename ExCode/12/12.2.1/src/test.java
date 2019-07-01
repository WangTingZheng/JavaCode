import java.awt.*;
class Myframe extends  Frame{  //窗口类产生窗口
	static int  id=0;
	Myframe(int x,int y,int w, int  h,Color c) {
		super("王听正20176626");
		setBounds(x,y,w,h);
		setBackground(c);
		setVisible(true);
	}
}
class getName{  //为了转化颜色与string
	String getColorName(Color color) {
		String name=null;
		if(color==Color.black) name="黑色";
		if(color==Color.gray) name="灰色";
		if(color==Color.red) name="红色";
		if(color==Color.yellow) name="黄色";
		if(color==Color.white) name="白色";
		if(color==Color.cyan) name="青色";
		if(color==Color.blue) name="蓝色";
	return name;
	}
}
public class test {  
	static getName gN=new getName();
	public static void changeColor(Myframe mf,Color color) {  //改变颜色方法
		mf.setBackground(color);  //设置窗口颜色
		try {
			Thread.sleep(500);  //延时以看出效果
			System.out.println("颜色变为"+gN.getColorName(color)+"!"); //用输出提示
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    public static void main(String[] args) { //主类
        Myframe MF=new Myframe(100,100,500,500,Color.blue);
        while(true) {   //循环
        	changeColor(MF,Color.black);  //在循环中改变颜色
        	changeColor(MF,Color.gray);
        	changeColor(MF,Color.red);
        	changeColor(MF,Color.yellow);
        	changeColor(MF,Color.white);
        	changeColor(MF,Color.cyan);
        	changeColor(MF,Color.blue);
        }
    }
}