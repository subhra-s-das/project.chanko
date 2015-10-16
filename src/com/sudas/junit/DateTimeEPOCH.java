package com.sudas.junit;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeEPOCH {

	public static void main(String[] args) {

		DateTime datetime = new DateTime();
		// Enter the EPOCH to get a date time
		datetime.setEPOCH(1444905794);
		// Enter Date Time to get EPOCH
		datetime.setDateTime("10/15/2015 00:00:00");

		System.out.println(datetime.getEpoch());
		System.out.println(datetime.getDateTime());

	}

}

class DateTime {
	String dateTime;
	long epoch;
	long EPOCH;

	// takes data time input and convert to epoch
	public void setEPOCH(long epoch) {
		this.epoch = epoch;
	}

	// takes epoch L and convert to date time
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getDateTime() {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		format.setTimeZone(TimeZone.getDefault());
		String DateTime = format.format(epoch * 1000);
		return DateTime;
	}

	public long getEpoch() {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		try {
			Date epochDate = format.parse(dateTime);
			EPOCH = epochDate.getTime() / 1000;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EPOCH;
	}

}
