/*
 * 如果n是首项，a是差的话，前四项分别为n n+a n+2a n+3a
 * 第i项就是n+[i-1]a，通过这个我们就能计算出前四项的和和前四项的积
 * 如果a=0，也就是公差等于0的话，四个积就是a的四次方，再加上a是往小了算的，所以积一定是所有值
 * 里最小的，最小的不能超过880，如果最小的等于880的话，其它肯定超过880，而他不能超过880，也就是a^4<880,所以a必须小于6
 * 如果n=0 和就是6a,而6a不能大于26，也就是6a<=26 a<=4所以a不能大于4
 */
package test;
class setAge{  //根据任意的和和积计算出a和n的界限
	int sum_b;  //sum_b是求和算出来的最大边界，对应的a的范围
	int product_b; //product_b是求积算出来的最大边界，对应n的范围
	int sum_o;     //和
	int product_o;  //积
	setAge(int sum,int product){
		this.sum_o=sum;
		this.product_o=product;
		this.sum_b=sum/4;
		this.product_b=(int)Math.sqrt(Math.sqrt(product));
	}
}
public class RunAge {
	public static void main(String args[]) {
		setAge sa=new setAge(26,880);//输入求和和求积
		
		int a,n,i;//n是首项，a的差，i是记数变量
		System.out.printf("The series with equal difference are:\n");
		for(n=1;n<=sa.product_b;n++)   //穷举法列出所有n的值
			for(a=1;a<=sa.sum_b;a++) {//穷举法列出所有a的值
				if(4*n+6*a==sa.sum_o&&n*(n+a)*(n+a+a)*(n+a+a+a)==sa.product_o)//如果是满足题目要求的n和a
					for(i=0;i<20;i++) {  //打印出1到20的每一项
						 System.out.println(n+i*a);
					}
					
			}
	}

}
