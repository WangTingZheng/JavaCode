
abstract class Anonymity	
{	abstract public void fun1();
};
public class Outer
{	public void callInner(Anonymity a)
	  {a.fun1(); }
	public static void main(String[] args)
	{	class inner extends Anonymity
		 {  public void fun1()
			 {System.out.println("���������");}	
		 };
		new Outer().callInner(new inner());	
	 }}
