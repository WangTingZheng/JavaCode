/*
 * arg数组需要外部输入
 */
public class ArgsPass{
	public static void printArray(String[] arg) {
		for(int i=0;i<arg.length;i++)  //我们可以通过访问数组的length属性来获取长度
		{System.out.println(arg[i]);}  //逐个打印数组的每一个元素
	}
		public static void main(String []args) {
			printArray(args);        //执行该方法
		}
}
