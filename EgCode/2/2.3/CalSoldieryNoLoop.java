/*
 * ȡ�����㣺���ŵ����������ˣ�����һ�ж�һ�ˣ�����һ�������ˣ�����һ�����ã�
 * ���ж����ˣ�
 *�������3����1����5��0����7��5
 *3...1
 *5...0
 *7...5
 *35�������5��7����0����3����2����Ҫ��3�������ͱ������2����������4����һλ��1
 *15�������3��5��������7����1����Ҫ��7����5���������5
 *21�������3��7��������5����1��Ҫ�뱻5����0��21����*5����������5����һλ����0
 *����ʽ�ӣ�35*2+15*5+21*5
 *������3��ʱ�򣬵�һ����1���ڶ�������0��������1��
 *������5ʱ�������0��������0��
 *������7ʱ����һ�������0���ڶ�����5��������5
 *���ʽ�ӷ������⣬�����Ƕ����ʽ�Ӽӻ��105(3��5��7�Ĺ�����)ʱ���Ը�����û��Ӱ��
 */
public class CalSoldieryNoLoop {
	public static void main(String args[]) {
		int sum=0;  //��������
		int BaseNum[]= {1,1,1}; //���������(��������ӵ���������)
		int num[]= {3,5,7};		//�������
		int left[]= {1,0,5};   //��������
		int flag[]= {0,0,0};    //���幫����
		flag[0] = num[1]*num[2];  //�󹫱���
		flag[1]	= num[0]*num[2];
		flag[2]	= num[0]*num[1];
		BaseNum[0]= flag[0]*(flag[0]%num[0])*left[0];  //�������
		BaseNum[1]= flag[1]*(flag[1]%num[1])*left[1];
		BaseNum[2]= flag[2]*(flag[2]%num[2])*left[2];
		sum=BaseNum[0]+BaseNum[1]+BaseNum[2];  //������
		sum %=num[0]*num[1]*num[2];  //������ѹ����100����
		System.out.print("ʿ����"+sum+"��");  //������
	}
}