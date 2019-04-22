package com.resource;

public class RunPlane extends FighterPlane{
	private void init() {
		name="su35";
		missileNum=5;
	}
	public static void main(String args[]) {
		FighterPlane fp=new FighterPlane();
		//fp.name="ку35";
		//fp.missileNum=6;
		fp.fire();
	}
}
