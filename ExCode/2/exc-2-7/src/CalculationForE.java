/*
 * 先写一个方法求1/n!,在一个循环中累计各个1/n!,求出e，至于精度，取决于最后那个阶层的最小除数的那个的精度，所以应该加到1/n!
 */
public class CalculationForE {
	static double  EValue=1f;
	public static double jichen(int n) {  //创立一个方法用来求1/n!
		double num=1;
		for(int i=1;i<=n;i++) {    //创立一个n次的循环
			num*=i;            //从1乘到n
		}
		return 1/num;    //返回1/n!
	}
	public static void main(String []args) {
		for(int j=1;j<10000;j++) {  //创立1到10000的循环
			EValue += jichen(j);  //把 1/1!到1/10000!的值累加起来
		}
		System.out.print(EValue);	//输出结果
	}
}

