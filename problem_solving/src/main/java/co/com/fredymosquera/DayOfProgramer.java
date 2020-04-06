package co.com.fredymosquera;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfProgramer {

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2017));
    }

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        LocalDate localDate = LocalDate.of(year, 01, 01);
        if(year == 1918){
            return "26.09."+year;
        }else if((year < 1918 && year % 4 == 0  ) || (year > 1918 && localDate.isLeapYear())){
            return   "12.09."+year;
        }
        return "13.09."+year;


    }

}
