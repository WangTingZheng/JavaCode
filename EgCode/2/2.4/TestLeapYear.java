/*
 * 普通闰年:能被4整除但不能被100整除的年份为普通闰年。
 * 世纪闰年:能被400整除的为世纪闰年。
 */
public class TestLeapYear{
	public static void isLeapYear(int year){   
		boolean n1 =(year%4==0);					  //能被4整除
		boolean n2 =(year%100==0);				      //能被100整除
		boolean n3 =(year%400==0);					  //能被400整除
		if((n1==true&&n2!=true)|(n2==true&&n3==true))  //前面一句是普通闰年，后面一句是世纪闰年
		{System.out.println(year+"年是闰年");}          
		else
		{System.out.println(year+"年不是闰年");}
	}
	public static void main(String args[]){           //入口方法，判定1900、1904、2000是否是闰年
		isLeapYear(1900);
		isLeapYear(1904);
		isLeapYear(2000);
	}
}