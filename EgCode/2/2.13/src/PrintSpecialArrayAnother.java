public class PrintSpecialArrayAnother {
	public static void PrintHan(int han) {  //����һ���ܴ�ӡһ�еķ���
		int flag=0;  //�������������
		int Flag=0;
		for(int lie=1;lie<=17;lie++) {  //����һ��ѭ������һ�еĵ�һ�������һ��
				if((lie<han)|(17-lie<han)) {  //�����ӡ��һ�е���˺��Ҷˣ���Щ��Ҫ�б仯��
					if((9-lie)<0) flag=lie-9;  //�ж�����߻����ұ�
					else flag=9-lie;
					System.out.print(flag);//��ӡ
				}
				else {                         //������м���������Ҫ�����ͬ����
					if((9-han)<0) Flag=han-9;
					else Flag=9-han;         //�۲��֪���������������֮��Ϊ8
					System.out.print(Flag);  //��ӡ
				}
				if(lie==17) System.out.println("");  //һ��forѭ������������һ�д�ӡ��ϣ�����
		}
	}
	public static void main(String []args) {  
		for(int i=1;i<=9;i++) PrintHan(i);  //��ӡ�ӵ�һ�е���9��
		for(int j=8;j>0;j--) PrintHan(j);   //��ӡ�ӵ�8�е���1��
	}
	
}
