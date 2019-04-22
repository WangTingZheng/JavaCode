class FighterPlane {
	String name;
	int missileNum;
	public  FighterPlane(String _name,int _missileNum) {
		name=_name;
		missileNum=_missileNum;
	}
	public void fire() {
		if(missileNum>0) {
			System.out.println("Now fire a missile!");
			missileNum -=1;
		}
		else {
			System.out.println("no missile left!");
		}
	}
}
class A{
	FighterPlane fp;
	public A(FighterPlane fpp) {
		this.fp=fpp;
	}
	public void invoke() {
		System.out.println(fp.name);
	}
}
public class Run{
	public static void main(String[] args) {
		FighterPlane ftp=new FighterPlane("su35",10);
		A a=new A(ftp);
		a.invoke();
	}
}
