/*
 * ��ͨ����:�ܱ�4���������ܱ�100���������Ϊ��ͨ���ꡣ
 * ��������:�ܱ�400������Ϊ�������ꡣ
 */
public class TestLeapYear{
	public static void isLeapYear(int year){   
		boolean n1 =(year%4==0);					  //�ܱ�4����
		boolean n2 =(year%100==0);				      //�ܱ�100����
		boolean n3 =(year%400==0);					  //�ܱ�400����
		if((n1==true&&n2!=true)|(n2==true&&n3==true))  //ǰ��һ������ͨ���꣬����һ������������
		{System.out.println(year+"��������");}          
		else
		{System.out.println(year+"�겻������");}
	}
	public static void main(String args[]){           //��ڷ������ж�1900��1904��2000�Ƿ�������
		isLeapYear(1900);
		isLeapYear(1904);
		isLeapYear(2000);
	}
}