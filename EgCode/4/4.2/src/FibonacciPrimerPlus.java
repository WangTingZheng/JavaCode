/*
 * 思路是利用数学方法直接算出Fibonacci的表达式，直接代值
 * 时间复杂度为1，只占3个变量的空间
 * 具体计算方法看https://blog.csdn.net/acecandy/article/details/83864763
 */
public class FibonacciPrimerPlus {
	public static long f6(int n) {
		double result = 0; 
		double temp = Math.sqrt(5.0); 
		result = (Math.pow((1 + temp) / 2, n) - Math.pow((1 - temp) / 2, n)) / temp; 
		return (long) result; 
	}
	public static void main(String args[]) {
		System.out.println(f6(40));
	}
}
