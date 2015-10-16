package DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateExample {

	public static void main(String[] args) {
		ChangeDate dateuse = new ChangeDate();
		dateuse.EpochToDateTime();
		dateuse.dateTimeToEpoch();

	}

}

class ChangeDate {

	public void EpochToDateTime() {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		format.setTimeZone(TimeZone.getDefault());
		String formatDate = format.format(new Date().getTime());
		System.out.println(formatDate);
		System.out.println("epoch " +new Date().getTime());
	}

	public void dateTimeToEpoch() {
		String dateTime = "21/09/2015 08:10:00";
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		try {
			Date epoch = format.parse(dateTime);
			System.out.println(epoch.getTime());

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
