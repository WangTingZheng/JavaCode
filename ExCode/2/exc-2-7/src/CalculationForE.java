/*
 * ��дһ��������1/n!,��һ��ѭ�����ۼƸ���1/n!,���e�����ھ��ȣ�ȡ��������Ǹ��ײ����С�������Ǹ��ľ��ȣ�����Ӧ�üӵ�1/n!
 */
public class CalculationForE {
	static double  EValue=1f;
	public static double jichen(int n) {  //����һ������������1/n!
		double num=1;
		for(int i=1;i<=n;i++) {    //����һ��n�ε�ѭ��
			num*=i;            //��1�˵�n
		}
		return 1/num;    //����1/n!
	}
	public static void main(String []args) {
		for(int j=1;j<10000;j++) {  //����1��10000��ѭ��
			EValue += jichen(j);  //�� 1/1!��1/10000!��ֵ�ۼ�����
		}
		System.out.print(EValue);	//������
	}
}

