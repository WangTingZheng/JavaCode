abstract class Anonymity 	//����һ��������
{abstract public void fun1();};
public class Outer
{
	 public static void main(String[] args)
	 {
	   new Outer().callInner(new Anonymity(){ //��������������������������
		   public void fun1(){   
			   System.out.println("���������");
		   }		   
	    });
	 }
	 public void callInner(Anonymity a){
		a.fun1();
	 }
}
