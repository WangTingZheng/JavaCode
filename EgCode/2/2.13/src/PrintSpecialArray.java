public class PrintSpecialArray {
	public static void main(String args[]) {
		final int num=8;    //num定义从那个数开始
		int[][] t=new int [2*num+1][2*num+1]; //创立一个有2*num+1乘以2*num+1，也就是17*17的二维矩阵
		//赋值，把相关的值一一对应地赋值给二维数组
		for(int i=0;i<=num;i++) {  //创建执行9的循环，i代表行
			for(int j = 0;j<=num;j++) {  //创建一个9的循环  两次循环构成数列的左上角，j代表列
				if(i<j) t[i][j]=num-i;   //填充一行中中间几个相同的数
				else t[i][j]=num-j;      //填充其它列，数字与列数之和为8
				t[i][2*num-j]=t[i][j];   //右上角对称填充
				t[2*num-i][j]=t[i][j];  //左下角对称填充
				t[2*num-i][2*num-j]=t[i][j]; //右下角对称填充
			}
		}
		//输出
		for(int i=0;i<2*num+1;i++) {    //循环所有列
			for(int j=0;j<2*num+1;j++) { //循环所有行
				System.out.print(t[i][j]);  //打印
			}
			System.out.println("");//一行打完，换行
		}
	}
}
