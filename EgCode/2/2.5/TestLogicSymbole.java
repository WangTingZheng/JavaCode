public class TestLogicSymbole{
	public static void main(String args[]){
		int out =10;
		boolean b1=false;
		if((b1==true)&&(out+=10)==20){            //���߼����������Ҫ���߶��������ұ߳�������߳�����
			System.out.println("���,out="+out);  //�ʶ����岻����
		}
		else{
			System.out.println("����,out="+out);
		}
	}
}