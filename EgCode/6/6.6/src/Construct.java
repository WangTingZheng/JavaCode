class Pare{
	int i=3;
	Pare(){}
};
public class Construct extends Pare{
	int i=8;
	Construct(){}
	Construct(int num){this();}
	int getSuper(){return super.i;};
	public static void main() {
		Construct ct =new Construct(9);
		System.out.println(ct.i);
		System.out.println(ct.getSuper());
	}
}
