package com.resource;
public class FighterPlane {
	protected String name;
	protected int missileNum;
	public void fire() {
		if(missileNum>0) {
			System.out.println("no fire a missile!");
			missileNum-=1;
		}
		else {
			System.out.println("No missile left!");
		}
	}
}
