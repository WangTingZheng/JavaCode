public class PrintSpecialArray {
	public static void main(String args[]) {
		final int num=8;    //num������Ǹ�����ʼ
		int[][] t=new int [2*num+1][2*num+1]; //����һ����2*num+1����2*num+1��Ҳ����17*17�Ķ�ά����
		//��ֵ������ص�ֵһһ��Ӧ�ظ�ֵ����ά����
		for(int i=0;i<=num;i++) {  //����ִ��9��ѭ����i������
			for(int j = 0;j<=num;j++) {  //����һ��9��ѭ��  ����ѭ���������е����Ͻǣ�j������
				if(i<j) t[i][j]=num-i;   //���һ�����м伸����ͬ����
				else t[i][j]=num-j;      //��������У�����������֮��Ϊ8
				t[i][2*num-j]=t[i][j];   //���ϽǶԳ����
				t[2*num-i][j]=t[i][j];  //���½ǶԳ����
				t[2*num-i][2*num-j]=t[i][j]; //���½ǶԳ����
			}
		}
		//���
		for(int i=0;i<2*num+1;i++) {    //ѭ��������
			for(int j=0;j<2*num+1;j++) { //ѭ��������
				System.out.print(t[i][j]);  //��ӡ
			}
			System.out.println("");//һ�д��꣬����
		}
	}
}
