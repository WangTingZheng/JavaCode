import java.awt.*;
public class Ui extends java.applet.Applet{
	public void init() {
		add(new Label("Your name:"));
		add(new TextField(30));
		add(new Label("sex:"));
		CheckboxGroup cbg= new CheckboxGroup();
		add(new Checkbox("Male",cbg,true));
		add(new Checkbox("Female",cbg,false));
		add(new Label("What are you like:"));
		add(new Checkbox("Apple "));
		add(new Checkbox("orange "));
		add(new Checkbox("Strawberry "));
		add(new Checkbox("Peach "));
		add(new Checkbox("How much do you eat them per week: "));
		Choice c=new Choice();
		c.addItem("less then 1kg");
		c.addItem("1kg to 3kg");
		c.addItem("more than 3kg");
		add(c);
		add(new Label ("What's your opnion of eating fruit:"));
		add(new TextArea("I think",3,60));
		add(new Button("ok"));
		add(new Button("Clear"));
	}
	public void paint(Graphics g) {
	}
}
