package javafortesters;

import org.testng.annotations.Test;

import java.util.Calendar;

import static org.testng.AssertJUnit.assertTrue;

public class ex7_DateTimes {
    @Test
    public void currentTimeMillis(){
        long startTime = System.currentTimeMillis();
        for(int x=0; x < 10; x++){
            System.out.println("Current Time " +
                    System.currentTimeMillis());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time " + (endTime - startTime));
    }

    @Test
    public void currentNanoTimes(){
        long startTime = System.nanoTime();
        for(int x=0; x < 10; x++){
            System.out.println("Current Time " +
                    System.nanoTime());
        }
        long endTime = System.nanoTime();
        System.out.println("Total Time " + (endTime - startTime));
    }

    @Test
    public void printCalendartoString(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime().toString());

    }

    @Test
    public void setCalendar(){
        Calendar cal = Calendar.getInstance();

        /*Set individuals fields*/
//        cal.set(Calendar.YEAR, 2018);
//        cal.set(Calendar.MONTH, 12);
//        cal.set(Calendar.DATE, 15);
//        cal.set(Calendar.HOUR_OF_DAY, 23);
//        cal.set(Calendar.MINUTE, 49);
//        cal.set(Calendar.SECOND, 54);

        /*Set all fields*/
        cal.set(2018, Calendar.DECEMBER, 15, 23,49, 54);
        System.out.println(cal.getTime().toString());

        assertTrue(cal.get(Calendar.YEAR) == 2018);
        assertTrue(cal.get(Calendar.MONTH) == Calendar.DECEMBER);
        assertTrue(cal.get(Calendar.DAY_OF_MONTH) == 15);
        assertTrue(cal.get(Calendar.HOUR_OF_DAY) == 23);
        assertTrue(cal.get(Calendar.HOUR) == 11);
        assertTrue(cal.get(Calendar.MINUTE) == 49);
        assertTrue(cal.get(Calendar.AM_PM) == Calendar.PM);

    }
}
