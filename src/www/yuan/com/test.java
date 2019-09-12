package www.yuan.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test{
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(simpleDateFormat.format(l));

        String in = "2018-08-12 14:24:13";
        Date parse = simpleDateFormat.parse(in);
        System.out.println(parse);

    }
    }

