class TestOne{   //����һ��������
	TestOne() {
		System.out.println("TestOne sucess has been done.");
	}
}
class TestTwo extends TestOne{
	TestTwo() {
		System.out.print("TestTwo sucess has been done.");
	}
}
class Son extends TestTwo{   //����һ����ͨ�࣬�̳г�����
	Son(){					//����Ĺ��췽�����и���Ĺ��췽��

	}
}

public class Run {
	public static void main(String args[]) {
		Son s=new Son();   //����һ������Ķ���
	}

}
