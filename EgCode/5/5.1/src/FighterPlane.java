public class FighterPlane {
	private String name;
	private int missileNum;
	public void setName(String _name) {
		if(_name!=null) {
			name=_name.trim();
		}
	}
	public void setNum(int _missleNum) {
		if(_missleNum>0) {
			missileNum = _missleNum;
		}
	}
	public void fire() {
		if(missileNum>0) {
			System.out.println("now fire a missile!");
		}
		else {
			System.out.println("No missile ldft!");
		}
	}
}
