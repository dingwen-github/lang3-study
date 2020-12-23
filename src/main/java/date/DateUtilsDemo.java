package date;

import utils.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program:
 * @description: DateUtils Demo
 * @author: dingwen
 * @create: 2020/12/22 18:06
 **/
public class DateUtilsDemo {
    public static void main(String[] args) {
        System.out.println(DateUtil.dateToStr(new Date(),"yyyy年MM月dd日"));
    }
}
