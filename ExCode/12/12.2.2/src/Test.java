import java.awt.*;
class getScreen{
	int width=0;
	int height=0;
	getScreen(){
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		width =screen.width; //��Ļ��ȣ�������Ϊ��λ
		height =screen.height; //��Ļ�߶� 
	}
}
class createMenu{
	createMenu(int positionWidth,int positionHeight,int sizeWidth,int sizeHeight,Color color){
		Frame f=new Frame();
		MenuBar bar=new MenuBar();
		getScreen gS=new getScreen();
		f.setMenuBar(bar);
		/***�������˵�****/
		
		Menu m1=new Menu("�ļ�");
		Menu m2=new Menu("����");
		Menu m3=new Menu("���");
		Menu m4=new Menu("�л�");
		Menu m5=new Menu("����");
		Menu m6=new Menu("�õ�Ƭ��ӳ");
		
		/***���ø����Ӳ˵�����Ŀ***/
		
		Menu m11=new Menu("��Ϣ");
		Menu m12=new Menu("�½�");
		Menu m13=new Menu("��");
		Menu m14=new Menu("����");
		Menu m15=new Menu("���Ϊ");
		Menu m16=new Menu("��ӡ");
		
		Menu m21=new Menu("�½��õ�Ƭ");
		Menu m22=new Menu("���");
		Menu m23=new Menu("ͼ��");
		Menu m24=new Menu("��״");
		Menu m25=new Menu("ͼ��");
		Menu m26=new Menu("������");
		
		Menu m31=new Menu("ģ��1");
		Menu m32=new Menu("ģ��2");
		Menu m33=new Menu("ģ��3");
		Menu m34=new Menu("ģ��4");
		Menu m35=new Menu("ģ��5");
		Menu m36=new Menu("ģ��6");
		
		
		Menu m41=new Menu("��");
		Menu m42=new Menu("���뵭��");
		Menu m43=new Menu("����");
		Menu m44=new Menu("����");
		Menu m45=new Menu("�ָ�");
		Menu m46=new Menu("����");
		
		Menu m51=new Menu("Ԥ��");
		Menu m52=new Menu("������ʽ");
		Menu m53=new Menu("Ч��ѡ��");
		Menu m54=new Menu("��Ӷ���");
		Menu m55=new Menu("��������");
		Menu m56=new Menu("����");
		
		Menu m61=new Menu("��ͷ��ʼ");
		Menu m62=new Menu("�ӵ�ǰ�õ�Ƭ��ʼ");
		Menu m63=new Menu("������ʾ");
		Menu m64=new Menu("�Զ���õ�Ƭ��ӳ");
		Menu m65=new Menu("���ûõ�Ƭ��ӳ");
		Menu m66=new Menu("���ػõ�Ƭ");
		
		/***����Ӳ˵������˵�***/
		
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
		
		/***������˵������ڵ�����***/
		
		bar.add(m1);
		bar.add(m2);
		bar.add(m3);
		bar.add(m4);
		bar.add(m5);
		bar.add(m6);
		
		f.setVisible(true); //���ô��ڿɼ�
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
