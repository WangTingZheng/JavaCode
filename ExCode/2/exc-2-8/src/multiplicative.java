/*
 * 一组乘法口诀由三部分组成，两个乘数，一个结果，我们其实只要有两个乘数就行，两个乘数的话有规律，第一个数与行数相同，第二个数与列数相同，只要知道了一个式子在第几行第几列，
 * 就知道它是什么样的,从左向右的顺序编号的话(num)，编号于列号(lie),行号(han)的关系是:num=(han+1)han/2+lie
 */
public class multiplicative {
	public static int num_together(int han) {  //该方法的作用是把求1到han行有多少个单位
		return (han+1)*han/2;					//每一行的单位数是从1开始的递增数列，求和方法自然是首项加尾项乘以项数除以二
	}
	public static int NumToHan(int num) {		//该方法的作用是把编号转化为行数，就是告诉你第几个单位在第几行
		int flag=0;
		for(int i=1;i<9;i++) {           //循环列出单位所在行的上一行，除第一个以外     
			if(num==1) flag=1;			 //如果是第一个，直接输出1，这个是特殊情况，不符合一下模型
			else if((num>num_together(i))&&(num<=num_together(i+1))){   //如果是其它情况，如果编号大于1到第i行单位数量的总和的话，就说单位在i行下面														
				flag=i+1;					//反之称为单位在i行上面。如果满足单位编号在第i行到第1行所有单位数量和与第i+1行到第1行所有单位数量之间的话
			}								//就说明单位的位置位于第i行以下，第i+1以上，那么它应该在i行以下，也就是i+1行，把值赋值给flag
		}
		return flag;                  //返回行数
	}
	public static int NumToLie(int num) {	  //该方法的作用是把编号转化为列数，就是告诉你第几个单位在某一行的第几列
		return num-NumToHan(num)*(NumToHan(num)-1)/2;  //所在编号减去第一行到单位所在上一行的所有单位数，就是列数
	}
	public static void main(String []args) {  //主方法
		int HanMain=1;
		int LieMain=1;
		for(int x=1;x<=45;x++) {            //循环列出所有式子，从第一个开始到第45个，也就是第9行的第9列的那一个
			HanMain=NumToHan(x);			//利用以前的方法求出当前算式的行数，并且赋值到HanMain这个变量里
			LieMain=NumToLie(x);			//利用以前的方法求出当前算式的列数，并且赋值到LieMain这个变量里
			System.out.print(HanMain+"x"+LieMain+"="+HanMain*LieMain);   //打出这个式子
			if(LieMain==HanMain) System.out.println("");	//如果一个算式行数于列数相同，说明已经打完一行了，不用再打个空格，需要打个换行了	
			else System.out.print("	");		//正常情况下，没到一行的最后一个，只需打一个空格与其它式子区分就好了
		}
	}
	
}
