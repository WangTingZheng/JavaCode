/*
 * ������ѭ�������õݹ�ķ�ʽ����⣬����Deliverһ���ܹ��ж�һ��ĸ�������Ƿ�ϸ�
 * ֻҪ֪��ĸ��������������֪������������(�ο�CalChickenLessLoop.java���ע��)����֪��С��������������ж��Ƿ�ϸ������
 * ��������֣�һ�������������ϸ������Ļ�ֱ����������һ���ǲ��ϸ������Ļ��ݹ������һ��ĸ��������Deliver����
 * ֱ��ĸ����������20ֹͣ��ĸ�����ֻ����20ֻ
 */
public class CalChickenNoLoop {
	public static void Deliver(int FemaleNum) {
		if((100-4*FemaleNum)%7==0) {   //�жϹ��������Ƿ�ϸ�
			if((100-((100-4*FemaleNum)/7+FemaleNum))%3==0) { //�ж�С�������Ƿ�ϸ�
					System.out.println("����"+((100-4*FemaleNum)/7)+"ֻ��ĸ��"+FemaleNum+"ֻ��С��"+(100-((100-4*FemaleNum)/7+FemaleNum))+"ֻ");
					//�ϸ�֮��ֱ��������
			}
		}
		if(FemaleNum<20) {  //����һ��ĸ���������жϣ����ĸ�������Ƿ�������
			Deliver(++FemaleNum);  //û�����޼����ݹ�
		}
		//�����е���һ��˵���Ѿ��������ˣ������ͽ�����
	}
	public static void main(String args[]) {
		Deliver(1);  //��1��ʼ����
	}
}
