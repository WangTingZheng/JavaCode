class Pare{}
class Pare1 extends Pare{}
class Pare2 {
   public static void main(String[] args){    
	 Pare   p  = new Pare();
	 Pare1  p1 = new Pare1();
	 Pare   pp = p1;
	 if (p1.equals(pp))
	   {System.out.println("p1��pp������ͬ");}
	 else
	   {System.out.println("p1��pp���ò�ͬ");}
	 if (p.equals(pp))
	   {System.out.println("p��pp������ͬ");}
	 else
	   {System.out.println("p��pp���ò�ͬ");}
   }
}