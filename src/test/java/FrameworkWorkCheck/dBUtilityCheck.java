package FrameworkWorkCheck;

import java.util.ArrayList;

import genericUtilities.DatabaseUtility;

public class dBUtilityCheck {
	
	public static void main(String[] args) {
		DatabaseUtility dBU=new DatabaseUtility();
		dBU.establishingDBConnection();
		ArrayList data = dBU.readingDatafromDB("select * from BatchData;","SLNO","Name");
		for(Object v:data) {
		//for (int i = 0; i < data.size(); i++ ) {
			//Object v = data.get(i);
			System.out.println(v);
		//}	
		}
		dBU.closingDBConnection();
	}
}
