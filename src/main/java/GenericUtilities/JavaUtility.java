package GenericUtilities;

import java.util.Random;

public class JavaUtility {
public int generateRandomNum(int range) {
	Random rn=new Random();
	return rn.nextInt(range);
}
}
