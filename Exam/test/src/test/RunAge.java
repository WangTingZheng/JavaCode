/*
 * ���n�����a�ǲ�Ļ���ǰ����ֱ�Ϊn n+a n+2a n+3a
 * ��i�����n+[i-1]a��ͨ��������Ǿ��ܼ����ǰ����ĺͺ�ǰ����Ļ�
 * ���a=0��Ҳ���ǹ������0�Ļ����ĸ�������a���Ĵη����ټ���a����С����ģ����Ի�һ��������ֵ
 * ����С�ģ���С�Ĳ��ܳ���880�������С�ĵ���880�Ļ��������϶�����880���������ܳ���880��Ҳ����a^4<880,����a����С��6
 * ���n=0 �;���6a,��6a���ܴ���26��Ҳ����6a<=26 a<=4����a���ܴ���4
 */
package test;
class setAge{  //��������ĺͺͻ������a��n�Ľ���
	int sum_b;  //sum_b���������������߽磬��Ӧ��a�ķ�Χ
	int product_b; //product_b���������������߽磬��Ӧn�ķ�Χ
	int sum_o;     //��
	int product_o;  //��
	setAge(int sum,int product){
		this.sum_o=sum;
		this.product_o=product;
		this.sum_b=sum/4;
		this.product_b=(int)Math.sqrt(Math.sqrt(product));
	}
}
public class RunAge {
	public static void main(String args[]) {
		setAge sa=new setAge(26,880);//������ͺ����
		
		int a,n,i;//n�����a�Ĳi�Ǽ�������
		System.out.printf("The series with equal difference are:\n");
		for(n=1;n<=sa.product_b;n++)   //��ٷ��г�����n��ֵ
			for(a=1;a<=sa.sum_b;a++) {//��ٷ��г�����a��ֵ
				if(4*n+6*a==sa.sum_o&&n*(n+a)*(n+a+a)*(n+a+a+a)==sa.product_o)//�����������ĿҪ���n��a
					for(i=0;i<20;i++) {  //��ӡ��1��20��ÿһ��
						 System.out.println(n+i*a);
					}
					
			}
	}

}
