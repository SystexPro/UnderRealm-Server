package net.underrealm.misc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Misc {
	
	
	public static void println(Object s) {
		System.out.println(s);
	}
	
	public static void info(Object s) {
		System.out.println(getTime() + " [INFO]" + s);
	}
	
	public static void server(Object s) {
		System.out.println(getTime() + " [SERVER]" + s);
	}
	
	public static void warning(Object s) {
		System.out.println(getTime() + " [WARNING]" + s);
	}
	
	public static String getTime() {
		Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	    return sdf.format(cal.getTime());
	}
	
	public static String build = "102";
}
