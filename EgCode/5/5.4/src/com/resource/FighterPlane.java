package com.resource;
public class FighterPlane {
	private String name;
	private int missileNum;
	private static FighterPlane fp;
	private FighterPlane(String _name,int  _missileNum) {
		name=_name;
		missileNum = _missileNum;
	}
	public static FighterPlane getInstance(String _name,int  _missileNum) {
		if(fp==null) {
			fp = new FighterPlane(_name,_missileNum);
		}
		return fp;
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
