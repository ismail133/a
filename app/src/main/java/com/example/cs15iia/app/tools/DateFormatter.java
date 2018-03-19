package com.example.cs15iia.app.tools;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by cs15iia on 19/03/2018.
 */
public class DateFormatter {

    private static String DATE_PATTERN = "dd/MM/yyyy";

    public static String convertDateToString(Date date){
        return new SimpleDateFormat(DATE_PATTERN).format(date);
    }
}