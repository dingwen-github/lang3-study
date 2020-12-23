package utils.entity;

import lombok.Builder;

/**
 * @program:
 * @description: 返回结果实体
 * @author: dingwen
 * @create: 2020/12/23 10:06
 **/
@Builder
public class DayCompare {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}