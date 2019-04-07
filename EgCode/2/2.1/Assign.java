public class Assign{                         //创建一个叫Assign的公共类
	public static void main(String args[]){  //这个是一个公共的、静态的(共享的)，无返回值的方法
		int x,y;							//定义两个个int型整数变量，每一个占16位
		float z= 1.234f;					 //定义一个float浮点型变量，每一个占32位，数字后的f代表
		double w=1.234;						 //定义一个double浮点型变量，每一个占64位，后面不带f，是
		boolean flag=true;					 //定义一个布尔型逻辑变量，每一位占2位，没有0，1
		char c;								 //定义一个char型字符变量，每一位占16位
		String str;						     //定义一个String(s大写，是类，不是数据类型)字符串
		String str1="Hi";                    //定义并且幅值字符串并赋值
		c = 'A';							 //给字符赋值，用单引号包括起来
		str = "bye";						 //给字符串赋值，用双引号包括起来							
		x=12;								
		y=300;
		System.out.print("x="+x+";\ny="+y+";\nz="+z+";\nw="+w+";\nflag="+flag+";\nc="+c+";\nstr="+str+";\nstr1="+str1);//输出结果
	}
}
		