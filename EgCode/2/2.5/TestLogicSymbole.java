public class TestLogicSymbole{
	public static void main(String args[]){
		int out =10;
		boolean b1=false;
		if((b1==true)&&(out+=10)==20){            //与逻辑运算符，需要两边都成立，右边成立而左边成立，
			System.out.println("相等,out="+out);  //故都整体不成立
		}
		else{
			System.out.println("不等,out="+out);
		}
	}
}