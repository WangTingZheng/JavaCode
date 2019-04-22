class FighterPlane{
	private String name;
	private int missileNum;
	private A a;
	public FighterPlane(String _name,int  _missileNum) {
		name=_name;
		missileNum=_missileNum;
	}
	public void fire() {
		if(missileNum>0) {
			System.out.println("Now fire a missile!");
			missileNum-=1;
		}
		else {
			System.out.println("no missile left!");
		}
	}
	public void setA(A _a) {
		if(_a!=null)
		{a=_a;}
	}
	
	public A getA() {
		if(a!=null) 
		{return a;}
		else return null;
	}
	public String getName() {
		return name;
	}
	public int getMissileNum() {
		return missileNum;
	}
}
class A{
	FighterPlane fp;
	public A(FighterPlane fpp) {
		this.fp=fpp;
		fpp.setA(this);
	}
	public void invoke() {
		System.out.println(fp.getName());
	}
}
public class Run {
	public static void main(String []args) {
		FighterPlane ftp=new FighterPlane("su35",10);
		A a=new A(ftp);
		a.invoke();
	}
}
