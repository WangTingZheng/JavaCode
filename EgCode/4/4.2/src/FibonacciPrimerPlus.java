/*
 * ˼·��������ѧ����ֱ�����Fibonacci�ı��ʽ��ֱ�Ӵ�ֵ
 * ʱ�临�Ӷ�Ϊ1��ֻռ3�������Ŀռ�
 * ������㷽����https://blog.csdn.net/acecandy/article/details/83864763
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
