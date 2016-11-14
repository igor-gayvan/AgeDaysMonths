/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.mycompany.agedaysmonths;

import java.util.Locale;
import org.joda.time.Months;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author Igor Gayvan
 */
public class AgeDaysMonths {

    public static void main(String[] args) {
        LocalDate birthdate = new LocalDate(2015, 11, 12);
        LocalDate now = new LocalDate();

        System.out.printf("My age in month: %d\n", Months.monthsBetween(birthdate, now).getMonths());
        System.out.printf("My age in days: %d\n", Days.daysBetween(birthdate, now).getDays());
        System.out.printf("Day of week my birtday: %s, %s\n", birthdate.getDayOfWeek(), birthdate.toString(DateTimeFormat.forPattern("E").withLocale(Locale.forLanguageTag("en"))));

    }

}
