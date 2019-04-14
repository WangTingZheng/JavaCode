/*
 * 想要访问value有两个方法：
 * 1.把value的修饰符改成static；
 * 2.对象应用一个对象
 */
public class AccessValueTwo {
	static int value;
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	   System.out.println(value);
	}
}
