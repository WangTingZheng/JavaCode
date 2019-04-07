/*
 * 图案由星和点组成，这种的称为一个单位，每一行的单位数与它的列数相同，每一个单元只有一个星，但点数由所在行决定
 */
public class StarAndPointer {
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
	public static void PrintBase(int PointerN) { //该方法能打印一个单位，只要知道点的数量
		System.out.print("*");         //先打一个星星，星星的数量是固定的，只要一个
		for(int j=1;j<PointerN;j++) System.out.print(".");	//创建一个循环PointerN次的循环，每循环一次就打印一个点，合起来就打印了PointerN个点
	}
	public static void main(String []args) {
		int pointer=1;    
		int base=1;
		for(int i=1;i<=36;i++) {   //循环列举所有单位，从1到第36个
			base =NumToLie(i);     //得出当前单位所在列赋值给base，得到当前单位所在行的单位数
			pointer=NumToHan(i);   //得出当前单位所在行赋值给pointer，得到当前单位所在的列，也是该单位点的数目
			PrintBase(pointer);    //打印当前单位
			if(base==pointer) System.out.println("");  //如果列数等于行数，说明到了一行的末尾，需要换行
		}
	}
}
