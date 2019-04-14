/*
 * 这个数列从第3项开始，每一项都等于前两项之和
 */
public class Fibonacci {
	public static long fseq(int n) {
		if(n<1) return -1;    //如果小于一，则这样的元素不存在
		if(n==1||n==2)  return 1; //如果等于1或2，则返回1，这是fibonacci数列规定的
			else return fseq(n-1)+fseq(n-2);  //如果大于2，则这一项等于前两项之和，递归
		}
	public static void main(String args[]) {
		for(int x=3;x<50;x++) {
			long startTime = System.currentTimeMillis();
			System.out.print("x="+x+",结果="+fseq(x));    //打印出结果
			long endTime = System.currentTimeMillis();
			System.out.println("耗时"+(endTime-startTime)+"毫秒");
		}
		System.out.println("ok");    //打印出结果
	}
}
