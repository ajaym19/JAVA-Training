package com.inheritance;

/*
 * Terms:
 * Class: BluePrint
 * SuperClass/Parent Class: class from where we will be acquiring the properties
 * Sub Class/Child Class: which inherits from Parent class
 *  Re usability
 */

public class HandSet {

	String handset = "SAMSUNG";
	public void makeCall() {
		
		System.out.println("Making Call from Parent Class");
	}
	
	public void endCall() {
		System.out.println("Ending call from Parent Class");
	}
	
}
