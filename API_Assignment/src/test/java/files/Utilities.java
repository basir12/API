package files;

import org.apache.commons.lang3.RandomStringUtils;

public class Utilities {

	static String randandomstr;
	static int randominteger;

	public static String rendamStirng() {

		randandomstr = RandomStringUtils.randomAlphabetic(5);

		return randandomstr;

	}

	public static int randaomInterger(int i) {

		randominteger = Utilities.randaomInterger(553);

		return 0;

	}
	
	
	public static void main(String[] args) {
		
		String basir =Utilities.rendamStirng();
		
		System.out.println(basir);
		
		
		
	}

}
