package FrameworkCheck;

import GenericUtilities.PropertiesUtility;

public class PropertreadCheck {

	public static void main(String[] args) {
		PropertiesUtility pu=new PropertiesUtility();
		System.out.println(pu.readDatafromProprtyfile("url"));
	}
}
