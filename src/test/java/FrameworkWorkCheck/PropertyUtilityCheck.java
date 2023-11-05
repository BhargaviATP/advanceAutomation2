package FrameworkWorkCheck;

import genericUtilities.PropertyUtility;

public class PropertyUtilityCheck {

	public static void main(String[] args) {
		PropertyUtility utility=new PropertyUtility();
		System.out.println(utility.getDatafromPropertyFile("url"));

	}
}
