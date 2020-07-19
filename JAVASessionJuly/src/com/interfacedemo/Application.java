package com.interfacedemo;

import com.inheritance.Mobiles;

public class Application {

	public static void main(String[] args) {
		ICICIBank obj = new ICICIBank();
		obj.createAccount();
		Mobiles obj2 = new Mobiles();

		// RBIBody obj3 = new RBIBody() ; wont work, cannot create object of Interface
	}
}
