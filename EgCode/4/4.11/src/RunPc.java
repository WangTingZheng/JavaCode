import java.awt.*;
import java.applet.*;
class Pc{
	static double ad=8;
}
public class RunPc extends Applet{
	public void paint(Graphics g) {
		Pc m=new Pc();
		Pc m1=new Pc();
		m.ad=0.1;
		g.drawString("m1="+m1.ad,20,50);
		g.drawString("Pc="+Pc.ad,20,70);
		g.drawString("m1="+m.ad,20,90);
	}
}
