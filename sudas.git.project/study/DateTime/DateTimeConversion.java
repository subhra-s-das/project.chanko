package DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class class1 {
	public void method() {

		Date date = new Date();
		long epoch = date.getTime();
		System.out.println("Current EPOCH : " + epoch / 1000);

		// convert this epoch to a current time-stamp
		DateFormat format = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		String formattedDate = format.format(new Date().getTime());
		System.out.println("Current Date Time : " + formattedDate);

		// convert a user epoch to time-stamp
		long userEPOCH = 1444890708;
		String dateTime = format.format(userEPOCH * 1000);
		System.out.println("Converted Date Time : " + dateTime);

		// convert time-stamp to epoch\
		String customDateTime = "15/02/2015 12:02:42";
		try {
			Date customEPOCH = format.parse(customDateTime);
			long epoch1 = customEPOCH.getTime();
			System.out.println("Converted EPOCH : " + epoch1 / 1000);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}