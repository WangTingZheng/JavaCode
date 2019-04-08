public class ArrayTranspose {
	public static void transpose(int [][] m) {
		if(m==null) return; //���m�ǿյģ�ֱ�ӷ���
		int temp;  
		for(int i=0;i<m.length;i++) {  //��������ѭ�������ʾ����е�ÿһ��Ԫ��
			for(int j=0;j<m.length;j++) {
				if(i>j) {
					temp = m[i][j];
					m[i][j]=m[j][i];  //��1 5 9 ���ߵ���ֵ�һ�
					m[j][i]=temp;
				}
			}
		}
	}
	public static void print(int [][]m) {
		if(m==null) return;
		for(int i=0;i<m.length;i++) {  //����һ��ѭ����ӡ������m��ȫ��Ԫ��
			for(int j=0;j<m.length;j++) {
				System.out.print(m[i][j]+" ");   //ÿ��ӡһ�������ӡһ���ո�
			}
			System.out.println("");  //����һ�У���һ�����з�
		}
	}
	public static void main(String args[]) {
		int [][]t= {{1,2,3},{4,5,6},{7,8,9}};  //��ʼ������
		print(t);                            //��ӡ��ԭ����
		transpose(t);                        //ת������
		System.out.println("ת�ú�ľ���Ϊ��");  
		print(t);                             //��ӡ��ת����ľ���
	}
}
