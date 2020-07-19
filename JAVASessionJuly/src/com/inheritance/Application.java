package com.inheritance;

public class Application {

	public static void main(String[] args) {
		HandSet parentObject = new HandSet();
		parentObject.makeCall();
		parentObject.endCall();
		
		Mobiles childObject = new Mobiles();
		System.out.println();
		childObject.makeCall();
		childObject.endCall();
		childObject.takeScreenshot();
		System.out.println(childObject.handset);
	}
}
