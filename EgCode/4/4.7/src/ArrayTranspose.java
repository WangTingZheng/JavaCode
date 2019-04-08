public class ArrayTranspose {
	public static void transpose(int [][] m) {
		if(m==null) return; //如果m是空的，直接返回
		int temp;  
		for(int i=0;i<m.length;i++) {  //创立两个循环来访问矩阵中的每一个元素
			for(int j=0;j<m.length;j++) {
				if(i>j) {
					temp = m[i][j];
					m[i][j]=m[j][i];  //把1 5 9 两边的数值兑换
					m[j][i]=temp;
				}
			}
		}
	}
	public static void print(int [][]m) {
		if(m==null) return;
		for(int i=0;i<m.length;i++) {  //创立一个循环打印出数组m的全部元素
			for(int j=0;j<m.length;j++) {
				System.out.print(m[i][j]+" ");   //每打印一个数多打印一个空格
			}
			System.out.println("");  //打完一行，打一个换行符
		}
	}
	public static void main(String args[]) {
		int [][]t= {{1,2,3},{4,5,6},{7,8,9}};  //初始化矩阵
		print(t);                            //打印出原矩阵
		transpose(t);                        //转化矩阵
		System.out.println("转置后的矩阵为：");  
		print(t);                             //打印出转化后的矩阵
	}
}
