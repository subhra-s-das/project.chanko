package sudas.study.example.zero;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class ClaculateAge {

	public static void main(String[] args) {

		DatetoEPOCH person = new DatetoEPOCH("Subhra S Das",
				"Flat 207/B1, Kumar Periwinkle", "25/05/1979 00:00:00");
		person.CalAge();
		
		EPOCHtoDate epochtodate = new EPOCHtoDate();
		epochtodate.epochTOdate(1440469462);
	}

}

class DatetoEPOCH {
	String name;
	String address;
	String DOB;

	// constructor

	public DatetoEPOCH(String name, String address, String DOB) {
		this.name = name;
		this.address = address;
		this.DOB = DOB;
	}

	// calculate age method
	public void CalAge() {
		// get the curent datetime
		long CurrentEpoch = System.currentTimeMillis() / 1000;

		// convert dd/mm/yyyy to epoch
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");

		try {
			Date date = format.parse(DOB);
			long time = date.getTime() / 1000;

			// find the current age subtruct creent time - DOB time
			long CurrentAge = CurrentEpoch - time;

			// convert currentAge EPOCH to years
			System.out.println(CurrentAge);

			// convert seconds to years
			System.out.println("Current Age " + ((((CurrentAge) / 3600)) / 24)
					/ 365);

		} catch (ParseException | java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class EPOCHtoDate
{
	
	public void epochTOdate(long EPOCH)
	{

		Date date = new Date(EPOCH*1000);
		String date1 = date.toString();
		System.out.println(date1);


	}
	
}
