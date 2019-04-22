class Plane{
	protected String name;
	public void setName(String _name) {
		name=_name;
	}
	public String getName(String _name) {
		return name;
	}
}
class FighterPlane extends Plane{
	private int missileNum;
	public void setNum(int _missileNum) {
		missileNum=_missileNum;
	}
	public void fire() {
		missileNum-=1;
	}
}
