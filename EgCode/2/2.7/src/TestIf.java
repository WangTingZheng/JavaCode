public class TestIf {
	public static void main(String[] args) {
		int x,y;   //�����������ͱ���x��y
		x = 7;y = 7; //����ֵ
		if(x>6)    //���x����6
			if(y>6) //���y����5
				System.out.println("�豸����");  //����豸����
		else									//���x>6��y>6��������
			System.out.println("�豸����");      //����豸����
	}
}
