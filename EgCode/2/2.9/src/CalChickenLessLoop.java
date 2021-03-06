/*
 * 设公鸡有x只，母鸡有y只，小鸡有z只，能列一个三元二次方程组：
 * 5x+3y+1/3*z=100  价钱和为100(1式)
 * x+y+z=100		数量为100(2式)
 * 其中，x和y是整数，z是3的倍数
 * 1式乘以3减去2式化简后:
 * 7x+4y=100 其中x和y都为整数，y最小取0，最大取20
 * 我们可以利用一个从0到20的循环，列出所有y的可能性，对应求出x，如果是整数(也就是100-4y是7的倍数)，则基本符和条件
 * 知道x和y之后，还得继续筛选，利用2式求出z，按照题意可知：z是3的倍数，符合这个条件的，是最终答案，输出就ok了
 */
public class CalChickenLessLoop {
		public static void main(String []args) {
			int j=0;
			for(int i=0;i<=20;i++) {  //利用循环列出所有母鸡数量的值
				if((100-4*i)%7==0) {  //判断公鸡的数量是不是整数
					j=(100-4*i)/7;    //计算除公鸡的数量
					if((100-i-j)%3==0) {//判断小鸡的数量是不是3的倍数
						System.out.println("公鸡"+j+"只，母鸡"+i+"只，小鸡"+(100-i-j)+"只"); //符合所有条件，输出
					}
				}
			}
		}
}
