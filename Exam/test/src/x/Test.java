package x;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class MyFrame extends Frame {
	List<Point> points = null;
	MyFrame() {
		points = new ArrayList<Point>();
		this.setBounds(300, 300, 400, 300);
		this.setVisible(true);
		this.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			MyFrame mf = (MyFrame) e.getSource();
			mf.addPoint(new Point(e.getX(), e.getY()));
			mf.repaint();
		}
		});
	}
	public void addPoint(Point p) {
		points.add(p);
	}
	public void paint(Graphics g) {
		Iterator iter = points.iterator();
		while(iter.hasNext()) {
			Point p = (Point) iter.next();
			g.setColor(Color.blue);
			g.fillOval(p.x, p.y, 10, 10);
		}
	}
}
public class Test {
	public static void main(String args[]) {
		MyFrame mf=new MyFrame();
	}
}