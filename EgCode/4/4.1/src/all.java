/*
 * 调用途径二：在其它类中引用一个对象，在用这个对象来调用
 */
public class all {
	public static void main(String args[]) {      
		FighterPlane FighterPlane= new FighterPlane();  //new一个对象，用FighterPlane这个遥控器指挥它
		FighterPlane1 FighterPlane1= new FighterPlane1();
		FighterPlane.fire();  //通过FighterPlane来访问
		FighterPlane1.init("su35");
	}
}