/*
 * 这个数列从第3项开始，每一项都等于前两项之和
 */
public class Fibonacci {
	public static int fseq(int n) {
		if(n<1) return -1;
		if(n==1||n==2)  return 1;
		else return fseq(n-1)+fseq(n-2);
		}
	public static void main(String args[]) {
		System.out.print(fseq(10));
	}
}
