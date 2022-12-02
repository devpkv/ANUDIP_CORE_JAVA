package internalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx {

	public static void date(Locale l)
	{
		DateFormat df = DateFormat.getTimeInstance();
		Date d = new Date();
		
		System.out.println(d);
	}
	public static void main(String[] args) {
		
		date(Locale.CHINA);

	}

}
