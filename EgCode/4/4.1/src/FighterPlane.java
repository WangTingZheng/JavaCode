/*
 * 访问方法的途径一：直接在本类的入口方法中调用 
 */
class FighterPlane {   //构造一个类，来描述战斗机
	String name;        //对象是名字和导弹数
	int missileNum;
	void fire() {       //方法是开火
		if(missileNum>0) {
			missileNum -=1;
			System.out.println("now fire a missile!");
		}
		else {
			System.out.println("No missile left!");
		}
	}
	public void main(String []args) {   
		fire();  //直接在本类中引用
	}
}
