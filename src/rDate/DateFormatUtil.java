package rDate;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
    public static void main(String[] args) {
        try {
            parse();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parse() throws ParseException {
        String dateString = "2016/02/25";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = simpleDateFormat.parse(dateString);
        System.out.println(date.toString());
    }
}
