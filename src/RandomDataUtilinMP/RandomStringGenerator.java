package RandomDataUtilinMP;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomStringGenerator {

	public static void main(String[] args) {
		
		String rsg = randomStringGenerator();
		System.out.println(rsg);
		
		rsg = getTodaysdate();
		System.out.println(rsg);
	}
	
	public static String randomStringGenerator() {

		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 5;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		
		String generatedString = buffer.toString();
		// System.out.println(generatedString);
		return generatedString;
	}
	
	public static String getTodaysdate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		String date1= dateFormat.format(date);
		System.out.println(date1);
		return date1;
	}
}