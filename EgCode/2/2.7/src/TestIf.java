public class TestIf {
	public static void main(String[] args) {
		int x,y;   //定义两个整型变量x和y
		x = 7;y = 7; //赋初值
		if(x>6)    //如果x大于6
			if(y>6) //如果y大于5
				System.out.println("设备正常");  //输出设备正常
		else									//如果x>6和y>6都不成立
			System.out.println("设备出错");      //输出设备出错
	}
}
