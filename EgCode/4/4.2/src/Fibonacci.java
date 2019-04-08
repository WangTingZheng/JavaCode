/*
 * 这个数列从第3项开始，每一项都等于前两项之和
 */
public class Fibonacci {
	public static int fseq(int n) {
		if(n<1) return -1;    //如果小于一，则这样的元素不存在
		if(n==1||n==2)  return 1; //如果等于1或2，则返回1，这是fibonacci数列规定的
			else return fseq(n-1)+fseq(n-2);  //如果大于2，则这一项等于前两项之和，递归
		}
	public static void main(String args[]) {
		System.out.print(fseq(10));    //打印出结果
	}
}
