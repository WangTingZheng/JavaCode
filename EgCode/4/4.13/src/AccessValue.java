/*
 * value虽然是AccessValue的对象，但是不是static的，和main不在一个空间里，
 * main没办法直接访问value，所以如果把注释去了，注释这句就会报错
 * 想要访问value有两个方法：
 * 1.把value的修饰符改成static；
 * 2.对象应用一个对象
 */
public class AccessValue {
    int value;
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	   // System.out.println(value);
	}
}
