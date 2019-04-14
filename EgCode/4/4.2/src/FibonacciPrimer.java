/*
 * 具体输思路是，一步一步来，每推进一个数就把之前的数覆盖了，直到到达终点
 * 时间复杂度为n，只使用了3个变量，空间复杂度大幅度衰减
 */
public class FibonacciPrimer {
	public static void display(int n) {
		long a,b,temp;
		a=b=temp=1;
		if(n<3) System.out.print("第"+n+"项是："+1);
		for(int i=1;i<=n-2;i++) {
			temp= a+b;
			a=b;
			b=temp;
		}
		System.out.print("第"+n+"项是："+temp);
	}
	public static void main(String args[]) {
		display(1000);
	}
}