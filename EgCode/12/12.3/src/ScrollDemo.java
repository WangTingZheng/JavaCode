import java.awt.*;
import java.awt.event.*;
public class ScrollDemo {
	public static void main(String args[]) {
		Frame f=new Frame ("ScrollPanel");
		TextArea t=new TextArea("",10,50,TextArea.SCROLLBARS_NONE);
		ScrollPane sp=new ScrollPane();
		sp.add(t);
		f.add(sp);
		f.pack();
		f.setVisible(true);
	}
}
