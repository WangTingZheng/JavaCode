class AA{
	AA(){
		this(1);
		System.out.println("A Zero");
	}
	AA(int x){
		this(1,2);
		System.out.println("A One");
	}
	AA(int x,int y){
		System.out.println("A Two");
	}
}
class A extends AA{
	A(){
		this(1);                       //�����ڶ������췽��
		System.out.println("A Zero");  //�������๹�췽���Դ����๹�췽�������Ե��ø���Ĺ��췽��
	}
	A(int x){					
		this(x,1);						//�������������췽��
		System.out.println("A One");    //ִ�����ִ����һ��
	}
	A(int x,int y){                    
		System.out.println("A Two");
	}
}

public class Run {
	public static void main(String args[]) {
		A a=new A();  //ʵ����A����ִ��A�ĵ�һ�����췽��
	}
}
