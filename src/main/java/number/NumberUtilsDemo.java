package number;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * @program:
 * @description: NumberUtils Demo
 * @author: dingwen
 * @create: 2020/12/22 17:51
 **/
public class NumberUtilsDemo {
    public static void main(String[] args) {
        //从数组中选出最大值
        System.out.println(NumberUtils.max(new int[] {2,9999,555,56,564545,4454,565,94}));
        //判断字符串是否全是整数
        System.out.println(NumberUtils.isDigits("1113.0"));
        //判断字符串是否是有效数字
//        System.out.println(NumberUtils.isNumber("046464.6"));
    }
}
