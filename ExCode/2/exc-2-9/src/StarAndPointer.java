/*
 * ͼ�����Ǻ͵���ɣ����ֵĳ�Ϊһ����λ��ÿһ�еĵ�λ��������������ͬ��ÿһ����Ԫֻ��һ���ǣ��������������о���
 */
public class StarAndPointer {
	public static int num_together(int han) {  //�÷����������ǰ���1��han���ж��ٸ���λ
		return (han+1)*han/2;					//ÿһ�еĵ�λ���Ǵ�1��ʼ�ĵ������У���ͷ�����Ȼ�������β������������Զ�
	}
	public static int NumToHan(int num) {		//�÷����������ǰѱ��ת��Ϊ���������Ǹ�����ڼ�����λ�ڵڼ���
		int flag=0;
		for(int i=1;i<9;i++) {           //ѭ���г���λ�����е���һ�У�����һ������     
			if(num==1) flag=1;			 //����ǵ�һ����ֱ�����1����������������������һ��ģ��
			else if((num>num_together(i))&&(num<=num_together(i+1))){   //�������������������Ŵ���1����i�е�λ�������ܺ͵Ļ�����˵��λ��i������														
				flag=i+1;					//��֮��Ϊ��λ��i�����档������㵥λ����ڵ�i�е���1�����е�λ���������i+1�е���1�����е�λ����֮��Ļ�
			}								//��˵����λ��λ��λ�ڵ�i�����£���i+1���ϣ���ô��Ӧ����i�����£�Ҳ����i+1�У���ֵ��ֵ��flag
		}
		return flag;                  //��������
	}
	public static int NumToLie(int num) {	  //�÷����������ǰѱ��ת��Ϊ���������Ǹ�����ڼ�����λ��ĳһ�еĵڼ���
		return num-NumToHan(num)*(NumToHan(num)-1)/2;  //���ڱ�ż�ȥ��һ�е���λ������һ�е����е�λ������������
	}
	public static void PrintBase(int PointerN) { //�÷����ܴ�ӡһ����λ��ֻҪ֪���������
		System.out.print("*");         //�ȴ�һ�����ǣ����ǵ������ǹ̶��ģ�ֻҪһ��
		for(int j=1;j<PointerN;j++) System.out.print(".");	//����һ��ѭ��PointerN�ε�ѭ����ÿѭ��һ�ξʹ�ӡһ���㣬�������ʹ�ӡ��PointerN����
	}
	public static void main(String []args) {
		int pointer=1;    
		int base=1;
		for(int i=1;i<=36;i++) {   //ѭ���о����е�λ����1����36��
			base =NumToLie(i);     //�ó���ǰ��λ�����и�ֵ��base���õ���ǰ��λ�����еĵ�λ��
			pointer=NumToHan(i);   //�ó���ǰ��λ�����и�ֵ��pointer���õ���ǰ��λ���ڵ��У�Ҳ�Ǹõ�λ�����Ŀ
			PrintBase(pointer);    //��ӡ��ǰ��λ
			if(base==pointer) System.out.println("");  //�����������������˵������һ�е�ĩβ����Ҫ����
		}
	}
}
