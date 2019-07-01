import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

class WindowTextArea extends Frame implements TextListener, ActionListener{	
	TextField tx1;
	TextArea ta2;
	Button btnDelete,btnAdd;
	
	WindowTextArea()
	{	
		setLayout(new FlowLayout());
	
		tx1=new TextField();
		ta2=new TextArea(6,15);
		btnDelete =new Button("delete");
		btnAdd =new Button("add");
		
		ta2.setEditable(false);
		tx1.addTextListener(this);
		btnDelete.addActionListener(this);
		btnAdd.addActionListener(this);
		
		add(tx1);
		add(ta2);
		add(btnDelete);
		add(btnAdd);
		setBounds(100, 100, 350, 160);
		setVisible(true);
		validate();

	}
	public void textValueChanged(TextEvent e){	
		
	}
	public void actionPerformed(ActionEvent e){
		Stack sta = new Stack();
			
		String str=tx1.getText();
		StringTokenizer fenxi=new StringTokenizer(str," ,'\n''\r'");
		if(e.getSource() == btnDelete){
			int temp,temp2;
			Integer in = new Integer((int) (sta.pop()));	//存在堆栈弹出数据的问题，无法解决
			temp2 = in.intValue();
			temp = ta2.getCaretPosition();
			ta2.replaceText("",temp2,temp);
		}
		if(e.getSource() == btnAdd){
			int n=fenxi.countTokens();	
			String[] a=new String[n];
				for(int i=0;i<n;i++){	
					String temp=fenxi.nextToken();
					a[i]=temp;
				}
			Arrays.sort(a);
			for(int i=0;i<n;i++)
				ta2.append(a[i]+"\n");
		}
		
		sta.push(new Integer(ta2.getCaretPosition()));
	}
}
public class RunTest 
{
	public static void main(String args[])
	{
		WindowTextArea win=new WindowTextArea();
	}
}
	

