package date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) throws ParseException {
        /*
        *  第一代日期类
        * 1) Date: 精确到毫秒，代表特定的瞬间
        * 2)SimpleDateFormat: 格式和解析日期的类SimpleDateFormat 格式化和解析日期的具体类。
        *   它允许进行格式化 (日期 -> 文本)、解析(文本 -> 日期)和规范化.
        */

        Date date = new Date();
        System.out.println("当前日期"+date);

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日 hh:mm:ss E");
        String formatRes = sdf.format(date);
        System.out.println("当前格式化日期" + formatRes);

        //1. 可以把一个格式化的String 转成对应的 Date
        String s ="1996年01月01日 10:20:30 星期一";
        Date parseDate = sdf.parse(s);
        System.out.println("parse=" + parseDate);

        // 第二代日期类,主要就是 Calendar类(日历).
        // public abstract class Calendar extends Object implements Serializable, Cloneable, Comparable<Calendar>

        // 2)Calendar 类是一个抽象类，构造器时 private
        // 可以通过 getInstance() 来获取实例

        Calendar c = Calendar.getInstance();
        System.out.println("Calendar=" + c);
        System.out.println("年="+ c.get(Calendar.YEAR));
        System.out.println("月= "+ c.get(Calendar.MONDAY));

        // 3) 第三代日期类常见方法(JDK8加入 )
        /*
        - LocalDate(日期)、LocalTime(时间)、LocalDateTime(日期时间)
            LocalDate只包含日期，可以获取日期字段
            LocalTime只包含时间，可以获取时间字段
            LocalDateTime包含日期+时间，可以获取日期和时间字段
        */
        LocalDateTime idt = LocalDateTime.now();
        System.out.println("年=" + idt.getYear());
        System.out.println("月=" + idt.getMonth());
        System.out.println("月=" + idt.getMonthValue());
        System.out.println("日=" + idt.getMonthValue());
        System.out.println("日=" + idt.getHour());
        System.out.println("日=" + idt.getMinute());
        System.out.println("日=" + idt.getSecond());

        // 格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY年MM月dd日 hh:mm:ss E");
        System.out.println( dtf.format(idt));
        LocalDateTime l = idt.minusMinutes(3456);
        System.out.println("3456分钟后的时间"+l);

    }
}
