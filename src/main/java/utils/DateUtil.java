package utils;


import utils.entity.DayCompare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 日期操作工具类
 *
 * @author dingwen
 * @create 2020-12-23 上午 11:13
 */
public class DateUtil {


    private static List<String> dateFormatPattern = new ArrayList<String>();

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

    static {
        dateFormatPattern.add("yyyy-MM-dd HH:mm:ss");
        dateFormatPattern.add("yyyy-MM-dd HH:mm:ss.S z");
        dateFormatPattern.add("yyyy-MM-dd G HH:mm:ss.S z");
        dateFormatPattern.add("yyyy-MM-dd HH:mm:ss.S 'UTC'");
        dateFormatPattern.add("yyyy-MM-dd G HH:mm:ss.S 'UTC'");
        dateFormatPattern.add("yyyy-MM-dd HH:mm:ss.S z");
        dateFormatPattern.add("yyyy-MM-dd HH:mm:ss.S a");
        dateFormatPattern.add("yyyy-MM-dd HH:mm:ssz");
        dateFormatPattern.add("yyyy-MM-dd HH:mm:ss z");
        dateFormatPattern.add("yyyy-MM-dd HH:mm:ss 'UTC'");
        dateFormatPattern.add("yyyy-MM-dd'T'HH:mm:ss.SX");
        dateFormatPattern.add("yyyy-MM-dd'T'HH:mm:ssX");
        dateFormatPattern.add("yyyy-MM-dd'T'HH:mmX");
        dateFormatPattern.add("yyyy-MM-dd HH:mm:ssa");
        dateFormatPattern.add("yyyy/MM/dd");
        dateFormatPattern.add("yyyy/M/d");
        dateFormatPattern.add("yyyy-MM-dd");
        dateFormatPattern.add("yyyy.M.d");
        dateFormatPattern.add("yyyy-M-d");
        dateFormatPattern.add("yyyy/M/d");
        dateFormatPattern.add("yyyy年M月d日");
        dateFormatPattern.add("yyyy年MM月dd日");
        dateFormatPattern.add("yyyy-MM-dd'T'HH:mm:ss.SSS+0800");
    }

    /**
     * date2比date1多的天数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int calculateDays(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1 = cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);
        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if (year1 != year2) {
            int timeDistance = 0;
            for (int i = year1; i < year2; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    // 闰年
                    timeDistance += 366;
                } else {
                    // 不是闰年
                    timeDistance += 365;
                }
            }
            return timeDistance + (day2 - day1);
        } else {
            return day2 - day1;
        }
    }

    /**
     * UTC(世界标准时间）转为标准时间
     * @param date
     * @return java.util.Date
     */
    public static Date transDateUTC(String date) throws Exception {
        date = date.replace("Z", " UTC");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        Date d = format.parse(date);
        return d;
    }

    /**
     *转为北京时间
     * @param date
     * @return java.util.Date
     */
    public static Date transDateBJ(String date) throws Exception {
        date = date.replace("+0800", " Z");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        Date d = format.parse(date);
        return d;
    }

    /**
     * 获取当前时间年份
     *
     * @return
     */
    public static Integer getYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取当前时间年份有参数
     *
     * @param date
     * @return
     */
    public static Integer getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取当前时间月份
     *
     * @param date
     * @return
     */
    public static Integer getMonday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONDAY);
    }

    /**
     * 获取当前时间天数
     *
     * @param date
     * @return
     */
    public static Integer getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 设置时间年份
     *
     * @param year
     * @param monday
     * @param day
     * @return
     */
    public static Date setDateTime(int year, int monday, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, monday, day);
        return calendar.getTime();
    }

    /**
     * 计算2个日期之间相差的  以年、月、日为单位，各自计算结果是多少
     * 比如：2011-02-02 到  2017-03-02
     * 以年为单位相差为：6年
     * 以月为单位相差为：73个月
     * 以日为单位相差为：2220天
     *
     * @param fromDate
     * @param toDate
     * @return
     */
    public static DayCompare dayCompare(Date fromDate, Date toDate) {
        Calendar from = Calendar.getInstance();
        from.setTime(fromDate);
        Calendar to = Calendar.getInstance();
        to.setTime(toDate);
        // 只要年月
        int fromYear = from.get(Calendar.YEAR);
        int fromMonth = from.get(Calendar.MONTH);

        int toYear = to.get(Calendar.YEAR);
        int toMonth = to.get(Calendar.MONTH);

        int year = toYear - fromYear;
        int month = toYear * 12 + toMonth - (fromYear * 12 + fromMonth);
        int day = (int) ((to.getTimeInMillis() - from.getTimeInMillis()) / (24 * 3600 * 1000));
        return DayCompare.builder().day(day).month(month).year(year).build();
    }

    /**
     * 精确计算2个日期之间相差的  相差多少年月日
     * 比如：2011-02-02 到  2017-03-02 相差 6年，1个月，0天
     *
     * @param fromDate
     * @param toDate
     * @return
     */
    public static DayCompare dayComparePrecise(Date fromDate, Date toDate) {
        Calendar from = Calendar.getInstance();
        from.setTime(fromDate);
        Calendar to = Calendar.getInstance();
        to.setTime(toDate);

        int fromYear = from.get(Calendar.YEAR);
        int fromMonth = from.get(Calendar.MONTH);
        int fromDay = from.get(Calendar.DAY_OF_MONTH);

        int toYear = to.get(Calendar.YEAR);
        int toMonth = to.get(Calendar.MONTH);
        int toDay = to.get(Calendar.DAY_OF_MONTH);
        int year = toYear - fromYear;
        int month = toMonth - fromMonth;
        int day = toDay - fromDay;
        return DayCompare.builder().day(day).month(month).year(year).build();
    }

    /**
     * 计算2个日期相差多少年
     * 列：2011-02-02  ~  2017-03-02 大约相差 6年
     *
     * @param fromDate
     * @param toDate
     * @return
     */
    public static Integer yearCompare(Date fromDate, Date toDate) {// 两参数分别是首次设立时间，基准时间
        DayCompare result = dayComparePrecise(fromDate, toDate);
        int year = 0;
        int month = 0;
        int day = 0;

        year = result.getYear();
        month = result.getMonth();
        day = result.getDay();
        // 如果月份相同的话就比较日
        if (month == 0) {
            // 如果是日比较大的话，将勘查年度加1
            if (day > 0) {
                ++year;
            }
            // 如果月份较大的话，将勘查年度加1
        } else if (month > 0) {
            ++year;
        }
        return year;

        /*// 月份差值大于0不足一年算一整年，反之不算一整年
        return result.getYear() + (result.getMonth() > 0 ? 1 : 0);*/
    }

    /**
     * 比较两个日期月日大小
     *
     * @param fromDate
     * @param toDate
     * @return
     */
    public static Boolean compareDate(Date fromDate, Date toDate) {
        Calendar from = Calendar.getInstance();
        from.setTime(fromDate);
        int fromMonth = from.get(Calendar.MONTH);
        int fromDay = from.get(Calendar.DAY_OF_MONTH);
        Calendar to = Calendar.getInstance();
        to.setTime(toDate);
        int toMonth = to.get(Calendar.MONTH);
        int toDay = to.get(Calendar.DAY_OF_MONTH);
        if (fromMonth < toMonth) {
            return true;
        } else if (fromMonth > toMonth) {
            return false;
        } else {
            if (fromDay < toDay) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 给定日期加天数
     *
     * @param fromDate
     * @param num      天数
     * @return
     */
    public static Date addDay(Date fromDate, Integer num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fromDate);
        calendar.add(Calendar.DAY_OF_MONTH, num);
        return calendar.getTime();
    }

    /**
     * 给定日期减天数
     *
     * @param fromDate
     * @param num      天数
     * @return
     */
    public static Date cutDay(Date fromDate, Integer num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fromDate);
        calendar.add(Calendar.DAY_OF_MONTH, -num);
        return calendar.getTime();
    }

    /**
     * 日期转换为指定格式
     *
     * @param d
     * @param format
     * @return
     */
    public static Date convert(Date d, String format) {
        if (d == null) {
            return null;
        }
        Date date = null;
        SimpleDateFormat f = new SimpleDateFormat(format);
        try {
            date = f.parse(f.format(d));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 将日期格式化成字符串
     *
     * @param date   日期
     * @param format 格式
     * @return
     */
    public static String dateToStr(Date date, String format) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

}

