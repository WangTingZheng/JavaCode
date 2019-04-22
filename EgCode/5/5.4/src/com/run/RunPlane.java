package com.run;
import com.resource.*;
public class RunPlane {
	public static void main(String args[]) {
		FighterPlane fp;
		fp = FighterPlane.getInstance("ку35", 6);
		fp.fire();
	}
}
