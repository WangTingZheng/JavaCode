public class PrintSpecialArrayAnother {
	public static void PrintHan(int han) {  //创立一个能打印一行的方法
		int flag=0;  //定义输出的数字
		int Flag=0;
		for(int lie=1;lie<=17;lie++) {  //建立一个循环，从一行的第一个到最后一个
				if((lie<han)|(17-lie<han)) {  //如果打印到一行的左端和右端，这些是要有变化的
					if((9-lie)<0) flag=lie-9;  //判断是左边还是右边
					else flag=9-lie;
					System.out.print(flag);//打印
				}
				else {                         //如果是中间的情况，就要输出相同的数
					if((9-han)<0) Flag=han-9;
					else Flag=9-han;         //观察可知，输出的数与行数之和为8
					System.out.print(Flag);  //打印
				}
				if(lie==17) System.out.println("");  //一个for循环结束，代表一行打印完毕，换行
		}
	}
	public static void main(String []args) {  
		for(int i=1;i<=9;i++) PrintHan(i);  //打印从第一行到第9行
		for(int j=8;j>0;j--) PrintHan(j);   //打印从第8行到第1行
	}
	
}
