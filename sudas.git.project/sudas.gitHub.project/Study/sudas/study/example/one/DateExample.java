package sudas.study.example.one;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		ChangeDate dateuse = new ChangeDate();
		dateuse.EpochToDateTime();
		dateuse.dateTimeToEpoch();

	}

}

class ChangeDate {

	public void EpochToDateTime() {
		DateFormat format = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		String formatDate = format.format(new Date().getTime());
		System.out.println(formatDate);
	}

	public void dateTimeToEpoch() {
		String dateTime = "21/09/2015 08:10:00";
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		try {
			Date epoch = format.parse(dateTime);
			System.out.println(epoch.getTime() / 1000);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
