import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    
    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DATE,day); 
        calendar.set(Calendar.MONTH,month-1);  
        calendar.set(Calendar.YEAR,year);        
        
        String SDay=calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,new Locale("en","US"));
        return SDay.toUpperCase();
    }

    public static void main(String[] args) throws IOException{
        

        int month = 8;

        int day = 5;

        int year = 2015;

        String res = findDay(month, day, year);
        System.out.println(res);
    }
}

