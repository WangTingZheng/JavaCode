import java.awt.*;
import java.awt.Polygon;


class MyCanvas extends Canvas{
	MyCanvas(){
		setBackground(Color.cyan);
	}
	
	 public void star(Graphics g, int x0, int y0, int r, String f) {
	        double ch = 72 * Math.PI / 180;// 圆心角的弧度数
	        int x1 = x0, x2 = (int) (x0 - Math.sin(ch) * r), x3 = (int) (x0 + Math
	                .sin(ch) * r), x4 = (int) (x0 - Math.sin(ch / 2) * r), x5 = (int) (x0 + Math
	                .sin(ch / 2) * r);
	        int y1 = y0 - r, y2 = (int) (y0 - Math.cos(ch) * r), y3 = y2, y4 = (int) (y0 + Math
	                .cos(ch / 2) * r), y5 = y4;
	 
	        int bx = (int) (x0 + Math.cos(ch) * Math.tan(ch / 2) * r);
	        int by = y2;
	 
	        Polygon a = new Polygon();
	        Polygon b = new Polygon();
	 
	        a.addPoint(x2, y2);
	        a.addPoint(x5, y5);
	        a.addPoint(bx, by);
	        b.addPoint(x1, y1);
	        b.addPoint(bx, by);
	        b.addPoint(x3, y3);
	        b.addPoint(x4, y4);
	 
	        if (f.equals("draw")) {
	            g.drawPolygon(a);
	            g.drawPolygon(b);
	        }
	        if (f.equals("fill")) {
	            g.fillPolygon(a);
	            g.fillPolygon(b);
	        }
	    }
	public void DrawSin(final Graphics g){
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.green);
        g.drawLine(0, 0, 0,getHeight());           
        g.setColor(Color.red);
        g.drawLine(0,h/2,w,h/2);  //x
        g.drawLine(w, h/2, w-10, h/2-10);
        g.drawLine(w, h/2, w-10, h/2+10);
        g.drawLine(w/2, 0,w/2, h); //y
        g.drawLine(w/2, 0, w/2-10, 10);
        g.drawLine(w/2, 0, w/2+10, 10);
        g.drawString("Y", w/2-20, 20);
        g.drawString("X", w-20, h/2+20);
        for(int x =0;x<w; x++){
             int y =(int) (Math.cos (x*Math. PI/180)*h/3+h/2);
            g.drawString("·", x, y);
        }
	}
	public void PaintE(Graphics g){
		int width=getWidth()/2;
		int height=getHeight()/2;
		int radius=(int)(Math.min(getWidth(),getHeight())*0.4);
		Polygon polygon=new Polygon();
		polygon.addPoint(width+radius,height);
		polygon.addPoint((int)(width+radius*Math.cos(2*Math.PI/8)),(int)(height-radius*Math.sin(2*Math.PI/8)));
		polygon.addPoint((int)(width+radius*Math.cos(4*Math.PI/8)),(int)(height-radius*Math.sin(4*Math.PI/8)));
		polygon.addPoint((int)(width+radius*Math.cos(6*Math.PI/8)),(int)(height-radius*Math.sin(6*Math.PI/8)));
		polygon.addPoint((int)(width+radius*Math.cos(8*Math.PI/8)),(int)(height-radius*Math.sin(8*Math.PI/8)));
		polygon.addPoint((int)(width+radius*Math.cos(10*Math.PI/8)),(int)(height-radius*Math.sin(10*Math.PI/8)));
		polygon.addPoint((int)(width+radius*Math.cos(12*Math.PI/8)),(int)(height-radius*Math.sin(12*Math.PI/8)));
		polygon.addPoint((int)(width+radius*Math.cos(14*Math.PI/8)),(int)(height-radius*Math.sin(14*Math.PI/8)));
		polygon.addPoint((int)(width+radius*Math.cos(16*Math.PI/8)),(int)(height-radius*Math.sin(16*Math.PI/8)));
		g.setColor(Color.blue);
	    g.drawPolygon(polygon);
	    g.setColor(Color.red);
	    g.setFont(new Font("TimesRoman",Font.BOLD,20));
	}
	public void paint(Graphics g){
		
		g.drawOval(122, 12, 2*120, 2*12);
		DrawSin(g);
        star(g, 200, 200, 100, "draw");
        PaintE(g);
	}
}

class WindowCavans extends Frame{
	MyCanvas canvas;   
	WindowCavans(){
		canvas=new MyCanvas();
		Panel pNorth=new Panel(), pSouth=new Panel();
		this.add(pNorth, BorderLayout.NORTH);
		this.add(pSouth, BorderLayout.SOUTH);
		this.add(canvas, BorderLayout.CENTER);
		setBounds(100, 100, 300, 200);
		setVisible(true);  
	}
}
public class Test{
	public static void main(String[] args){
		WindowCavans W=new WindowCavans();
	}
}


