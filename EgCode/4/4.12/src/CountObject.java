
public class CountObject {
	private static int i=0;
	CountObject(){
		i++;
	}
	public int getI() {
		return i;
	};
	public static void main(String args[]) {
		//CountObject是类CountObject的构造方法
		CountObject t=new CountObject();  //new这个构造方法，它就被执行一次，i变成1，并且t指向这个对象
		t = new CountObject();//再次new这个构造方法，又执行一次，i变成2，t断了与原来对象的关系，重新指向这个新的对象
		System.out.println(t.getI());//最后用t这个对象来访问getI()方法来输出，发现确实是2
	}
}
/*

}*/
