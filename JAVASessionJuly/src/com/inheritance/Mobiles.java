package com.inheritance;

public class Mobiles extends HandSet {

	//Over-Riding
	
	public void takeScreenshot() {
		System.out.println("Taking Screenshot from Child Class");
	}

	public void makeCall() {
		System.out.println("Making Call from Child Class");
	}

	public void endCall() {
		System.out.println("Ending Call from Child Class");
	}
}
