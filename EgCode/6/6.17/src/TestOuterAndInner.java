class Outer
{ private String index="The String is in Outer Class";
	 public class Inner
	 {	  String index="The String is in Inner Class";
		  void print()
		  {
		   String index="The String is in print Method";
		   System.out.println(index);
		   System.out.println(this.index);
		   System.out.println(Outer.this.index);
		  }
	 }
	 void print()
	 {	  Inner inner = new Inner();
		  inner.print();	 }
	 Inner getInner()//ע�⣺����ʹ�ô˷��������ڲ���ʵ������
	 {
		 return new Inner();
	 }
}
public class TestOuterAndInner
{
	 public static void main(String[] args)
	 {
	  Outer outer = new Outer();	   //�Ȳ����ⲿ�����
	//Outer.Inner inner = outer.getInner();//�ڲ���ǰû��publicʱ�ķ��ʷ���
	  Outer.Inner inner = outer.new Inner(); //���ö����new����
	  inner.print();
	 }
}

