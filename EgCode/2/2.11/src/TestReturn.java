public class TestReturn {
	public static void main(String[] args) {
		int i = 10;
		if(i<5) {
			return ;
			//i=6;  去掉此句的注释将会编译错误，因为return是一个方法的结束语句，后面不允许有语句
		}
		else
		{
			//return;去掉此句的注释将会编译错误， 
		}
		i=5;
	}
}
