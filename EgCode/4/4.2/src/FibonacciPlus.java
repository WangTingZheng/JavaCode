
public class FibonacciPlus {
	public static long fseq(int n) {
		if(n<1) return -1;    //如果小于一，则这样的元素不存在
		if(n==1||n==2)  return 1; //如果等于1或2，则返回1，这是fibonacci数列规定的
			else return fseq(n-1)+fseq(n-2);  //如果大于2，则这一项等于前两项之和，递归
		}
	public static void test(int t) {
		long startTime = System.currentTimeMillis();
		System.out.println(fseq(t));    //打印出结果
		long endTime = System.currentTimeMillis();
		System.out.println("输出第"+t+"项需要"+(endTime-startTime)+"ms");
	}
	public static void main(String args[]) {
		/*test(10);
		test(100);
		test(1000);
		*/
		System.out.println(fseq(99));    //打印出结果
		System.out.println("ok");    //打印出结果
		
	}

}
