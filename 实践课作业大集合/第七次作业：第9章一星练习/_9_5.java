package ���ߴ���ҵ;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class _9_5 {

	public static void main(String[] args) {
		GregorianCalendar Date = new GregorianCalendar();
        System.out.println("����ǰ");
        System.out.println("Present Year: " + Date.get(GregorianCalendar.YEAR));
        // System.out.println("Present Month: " + Date.getDisplayName(GregorianCalendar.MONTH,GregorianCalendar.SHORT, Locale.CHINA));
        System.out.printf("Present Month: %d\n" ,Date.get(GregorianCalendar.MONTH) + 1);
        System.out.println("Present Day: " + Date.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.printf("\n���ĺ�\n");
        Date.setTimeInMillis(1234567898765L);
        System.out.println("Present Year: " + Date.get(GregorianCalendar.YEAR));
        System.out.printf("Present Month: %d\n" ,Date.get(GregorianCalendar.MONTH) + 1);
        System.out.println("Present Day: " + Date.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
