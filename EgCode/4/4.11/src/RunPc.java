/*
 * static ���ε��������������ڴ���������
 * ͨ������Ӧ�������ʣ����ʵĸ�ʽ������.����
 * �ñ������Ա������������
 */
import java.awt.*;
import java.applet.*;
class Pc{
	//��Pc������ﶨ��һ��static�ı����浽�ڴ���
	static double ad=8;
}
public class RunPc extends Applet{
	public void paint(Graphics g) {
		//ͨ���������ó���������
		Pc m=new Pc();
		Pc m1=new Pc();
		m.ad=0.1;//ͨ����һ������m���޸�ad��ֵ
		g.drawString("m1="+m1.ad,20,50);//��m1���������ʾad��ֵ
		g.drawString("Pc="+Pc.ad,20,70);//��Pc���������ʾad��ֵ
		g.drawString("m="+m.ad,20,90);//��m���������ʾad��ֵ
	}
}
//����ֶ�һ��