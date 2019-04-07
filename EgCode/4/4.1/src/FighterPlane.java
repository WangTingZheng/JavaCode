 class FighterPlane {
	String name;
	int missileNum;
	void fire() {
		if(missileNum>0) {
			missileNum -=1;
			System.out.println("now fire a missile!");
		}
		else {
			System.out.println("No missile left!");
		}
	}
	public void main(String []args) {
		fire();
	}
}
