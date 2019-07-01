import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends Frame{  //创建border布局
	Button bSouth, bNorth, bWest, bEast;
	TextArea text;
	MyFrame(String name){     
		super(name);
		bSouth=new Button("我在南边");
		bNorth=new Button("我在北边");
		bWest=new Button("我在西边");
		bEast=new Button("我在东边");
		text=new TextArea("我在中间");
		this.add(bSouth, BorderLayout.SOUTH);
		this.add(bNorth, BorderLayout.NORTH);
		this.add(bWest, BorderLayout.WEST);
		this.add(bEast, BorderLayout.EAST);
		this.add(text, BorderLayout.CENTER);
		this.setBounds(100, 100, 300, 300);
		this.setVisible(true);
		this.validate();
	}
}
class WinCard extends Frame implements ActionListener{ //创建卡片布局
	CardLayout card;
	Button btnFirst, btnNext, btnLast;
	Panel pCenter, pSouth;
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btnFirst)
			card.first(pCenter);
		else if(e.getSource()==btnNext)
		card.next(pCenter);
		else if(e.getSource()==btnLast)
		card.last(pCenter);
	}
	WinCard(String name){
		super(name);
		card=new CardLayout();
		pCenter=new Panel();
		pCenter.setLayout(card);
		for(int i=1;i<=20;i++)
		pCenter.add("I am"+i, new Button("我是第"+i+"个按钮"));
		pSouth=new Panel();
		btnFirst=new Button("first");
		btnNext=new Button("next");
		btnLast=new Button("last");
		btnFirst.addActionListener(this);
		btnNext.addActionListener(this);
		btnLast.addActionListener(this);
		pSouth.add(btnFirst);
		pSouth.add(btnNext);
		pSouth.add(btnLast);
		add(pCenter, BorderLayout.CENTER);
		add(pSouth, BorderLayout.SOUTH);
		setBounds(10, 10, 200, 200);
		setVisible(true);
	}
}

class WinGrid extends Frame{ //创建grid布局
	GridLayout grid;
	WinGrid(){
		grid=new GridLayout(12, 12);
		setLayout(grid);
		Label[][] label=new Label[12][12];
		for(int i=0;i<12;i++){
			for(int j=0;j<12;j++){
				label[i][j]=new Label();
				if((i+j)%2==0)
					label[i][j].setBackground(Color.black);
				else
				    label[i][j].setBackground(Color.white);
				add(label[i][j]);
				}}
		setBounds(10, 10, 300, 300);
		setVisible(true);
		validate();
	}
}
class WindowBox extends Frame{ //创建box布局
	Box baseBox, boxV1, boxV2; 
	WindowBox(){
	boxV1=Box.createVerticalBox();
	boxV2=Box.createVerticalBox();
	baseBox=Box.createHorizontalBox();
	boxV1.add(new Label("姓名"));
	boxV1.add(Box.createVerticalStrut(8));
	boxV1.add(new Label("email"));
	boxV1.add(Box.createVerticalStrut(8));
	boxV1.add(new Label("职业"));
	boxV2.add(new TextField(12));
	boxV2.add(Box.createVerticalStrut(8));
	boxV2.add(new TextField(12));
	boxV2.add(Box.createVerticalStrut(8));
	boxV2.add(new TextField(12));
	baseBox.add(boxV1);
	baseBox.add(Box.createHorizontalStrut(10));
	baseBox.add(boxV2);
	setLayout(new FlowLayout());
	add(baseBox);
	setBounds(120, 125, 250, 150);      
	setVisible(true);       
	}     
}
class MyButton extends Button implements ActionListener{  
	int n=-1;
	MyButton(){
		addActionListener(this);
	}
	public void paint(Graphics g) {
		g.drawString("单", 6, 16);
		g.drawString("击", 6, 36);
		g.drawString("我", 6, 56);
	}
	public void actionPerformed(ActionEvent e){
		n=(n+1)%3;
		if(n==0)
		setBackground(Color.red);
		else if(n==1)
		setBackground(Color.yellow);
		else if(n==2)
		setBackground(Color.green);
	}
}
class WindowNull extends Frame{  //创建null布局
	WindowNull(){     
		setLayout(null);
		MyButton btn=new MyButton();
		Panel p=new Panel();
		p.setLayout(null);
		p.setBackground(Color.cyan);
		p.add(btn);
		btn.setBounds(20, 10, 25, 70);
		add(p);
		p.setBounds(50, 50, 90, 100);
		setBounds(120, 125, 200, 200);
		setVisible(true);
	}
}

class mainFrame extends Frame implements ActionListener{ //创建控制窗口
	Button btn1,btn2,btn3,btn4,btn5;
	int flag[]=new int[5];
	int oflag[]=new int[5];
	MyFrame win1=null;
	WinCard win2=null;
	WinGrid win3=null;
	WindowBox win4=null;
	WindowNull win5=null;
	int num=0;
	mainFrame(){
		btn1=new Button("border");
		btn2=new Button("car");
		btn3=new Button("grid");
		btn4=new Button("box");
		btn5=new Button("null");
		
		this.add(btn1, BorderLayout.SOUTH);
		this.add(btn2, BorderLayout.NORTH);
		this.add(btn3, BorderLayout.WEST);
		this.add(btn4, BorderLayout.EAST);
		this.add(btn5, BorderLayout.CENTER);
		
		this.setSize(2800,1500);
		this.setBounds(this.getWidth()/2,this.getHeight()/2,600,300);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		setVisible(true);
	
	}
	public void closeWind(int i) {
		if(i==1)
			win1.dispose();
		if(i==2)
			win2.dispose();
		if(i==3)
			win3.dispose();
		if(i==4)
			win4.dispose();
		if(i==5)
			win4.dispose();
		
		flag[i-1]=0;
	}
	public void openWind(int j) {
		if(j==1)
			win1=new MyFrame("窗体");
		if(j==2)
			win2=new WinCard("窗体");
		if(j==3)
			win3=new WinGrid();
		if(j==4)
			win4 =new WindowBox();
		if(j==5)
			win5=new WindowNull();
		flag[j-1]=1;
	}
	public void closeAll() {
		for(int x=1;x<6;x++)
			closeWind(x);
	}
	public void openAll() {
		for(int y=1;y<6;y++)
			openWind(y);
	}
	public void openY() {
		for(int f=0;f<5;f++) {
			if(oflag[f]==1) {
				closeWind(f+1);
			}
			if(oflag[f]==2) {
				openWind(f+1);
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent k) {
		for(int e=0;e<5;e++) {
			oflag[e]=flag[e];
		}
		if(k.getSource()==btn1)
			oflag[0]=2;
		if(k.getSource()==btn2)
			oflag[1]=2;
		if(k.getSource()==btn3)
			oflag[2]=2;
		if(k.getSource()==btn4)
			oflag[3]=2;
		if(k.getSource()==btn5)
			oflag[4]=2;
		openY();
	}	
}

public class Test{
	public static void main(String[] args){
		mainFrame mf=new mainFrame();
	}
}
