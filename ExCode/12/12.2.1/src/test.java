import java.awt.*;
class Myframe extends  Frame{  //�������������
	static int  id=0;
	Myframe(int x,int y,int w, int  h,Color c) {
		super("������20176626");
		setBounds(x,y,w,h);
		setBackground(c);
		setVisible(true);
	}
}
class getName{  //Ϊ��ת����ɫ��string
	String getColorName(Color color) {
		String name=null;
		if(color==Color.black) name="��ɫ";
		if(color==Color.gray) name="��ɫ";
		if(color==Color.red) name="��ɫ";
		if(color==Color.yellow) name="��ɫ";
		if(color==Color.white) name="��ɫ";
		if(color==Color.cyan) name="��ɫ";
		if(color==Color.blue) name="��ɫ";
	return name;
	}
}
public class test {  
	static getName gN=new getName();
	public static void changeColor(Myframe mf,Color color) {  //�ı���ɫ����
		mf.setBackground(color);  //���ô�����ɫ
		try {
			Thread.sleep(500);  //��ʱ�Կ���Ч��
			System.out.println("��ɫ��Ϊ"+gN.getColorName(color)+"!"); //�������ʾ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    public static void main(String[] args) { //����
        Myframe MF=new Myframe(100,100,500,500,Color.blue);
        while(true) {   //ѭ��
        	changeColor(MF,Color.black);  //��ѭ���иı���ɫ
        	changeColor(MF,Color.gray);
        	changeColor(MF,Color.red);
        	changeColor(MF,Color.yellow);
        	changeColor(MF,Color.white);
        	changeColor(MF,Color.cyan);
        	changeColor(MF,Color.blue);
        }
    }
}