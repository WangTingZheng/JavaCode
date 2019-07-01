import java.awt.*;
class getScreen{
	int width=0;
	int height=0;
	getScreen(){
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		width =screen.width; //屏幕宽度，以像素为单位
		height =screen.height; //屏幕高度 
	}
}
class createMenu{
	createMenu(int positionWidth,int positionHeight,int sizeWidth,int sizeHeight,Color color){
		Frame f=new Frame();
		MenuBar bar=new MenuBar();
		getScreen gS=new getScreen();
		f.setMenuBar(bar);
		/***设置主菜单****/
		
		Menu m1=new Menu("文件");
		Menu m2=new Menu("插入");
		Menu m3=new Menu("设计");
		Menu m4=new Menu("切换");
		Menu m5=new Menu("动画");
		Menu m6=new Menu("幻灯片放映");
		
		/***设置各个子菜单的项目***/
		
		Menu m11=new Menu("信息");
		Menu m12=new Menu("新建");
		Menu m13=new Menu("打开");
		Menu m14=new Menu("保存");
		Menu m15=new Menu("另存为");
		Menu m16=new Menu("打印");
		
		Menu m21=new Menu("新建幻灯片");
		Menu m22=new Menu("表格");
		Menu m23=new Menu("图像");
		Menu m24=new Menu("形状");
		Menu m25=new Menu("图标");
		Menu m26=new Menu("加载项");
		
		Menu m31=new Menu("模板1");
		Menu m32=new Menu("模板2");
		Menu m33=new Menu("模板3");
		Menu m34=new Menu("模板4");
		Menu m35=new Menu("模板5");
		Menu m36=new Menu("模板6");
		
		
		Menu m41=new Menu("无");
		Menu m42=new Menu("淡入淡出");
		Menu m43=new Menu("推入");
		Menu m44=new Menu("擦除");
		Menu m45=new Menu("分割");
		Menu m46=new Menu("切入");
		
		Menu m51=new Menu("预览");
		Menu m52=new Menu("动画样式");
		Menu m53=new Menu("效果选项");
		Menu m54=new Menu("添加动画");
		Menu m55=new Menu("动画窗格");
		Menu m56=new Menu("触发");
		
		Menu m61=new Menu("从头开始");
		Menu m62=new Menu("从当前幻灯片开始");
		Menu m63=new Menu("联机演示");
		Menu m64=new Menu("自定义幻灯片放映");
		Menu m65=new Menu("设置幻灯片放映");
		Menu m66=new Menu("隐藏幻灯片");
		
		/***添加子菜单到主菜单***/
		
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		m1.add(m15);
		m1.add(m16);
		
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		m2.add(m25);
		m2.add(m26);
		
		m3.add(m31);
		m3.add(m32);
		m3.add(m33);
		m3.add(m34);
		m3.add(m35);
		m3.add(m36);

		m4.add(m41);
		m4.add(m42);
		m4.add(m43);
		m4.add(m44);
		m4.add(m45);
		m4.add(m46);
		
		m5.add(m51);
		m5.add(m52);
		m5.add(m53);
		m5.add(m54);
		m5.add(m55);
		m5.add(m56);

		m6.add(m61);
		m6.add(m62);
		m6.add(m63);
		m6.add(m64);
		m6.add(m65);
		m6.add(m66);
		
		/***添加主菜单到窗口的条上***/
		
		bar.add(m1);
		bar.add(m2);
		bar.add(m3);
		bar.add(m4);
		bar.add(m5);
		bar.add(m6);
		
		f.setVisible(true); //设置窗口可见
		f.setBounds(positionWidth,positionHeight,sizeWidth,sizeHeight);
		f.setBackground(color);
	}
	
}
public class Test{	
	public static void main(String[] args){
		getScreen gs=new getScreen();
		
		int width =gs.width;
		int height =gs.height;
		int ScreenWidth= 400;
		int ScreenHeight=300;
		
		createMenu cm1=new createMenu(0,0,400,300,Color.black);  //
		createMenu cm2=new createMenu(0,width-ScreenWidth,400,300,Color.white);
		createMenu cm3=new createMenu(height-ScreenHeight,0,400,300,Color.blue);
		createMenu cm4=new createMenu(height-ScreenHeight,width-ScreenWidth,400,300,Color.yellow);
	}
}
