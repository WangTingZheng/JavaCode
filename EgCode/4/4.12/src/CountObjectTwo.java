
public class CountObjectTwo {
	private static int i=0;
	CountObjectTwo(){
		i++;
	}
	public int getI() {
		return i;
	};
	public static void main(String args[]) {
	//CountObject是类CountObject的构造方法
		CountObject t=null;
		for(int j=0;j<9;j++) {
			t = new CountObject();
		}
		System.out.println(t.getI());//最后用t这个对象来访问getI()方法来输出，发现确实是2
	}
}
