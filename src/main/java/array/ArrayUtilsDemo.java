package array;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Map;

/**
 * @program:
 * @description: ArrayUtils Demo
 * @author: dingwen
 * @create: 2020/12/22 17:58
 **/
public class ArrayUtilsDemo {
    public static void main(String[] args) {
        //创建数组
        String[] array = ArrayUtils.toArray("1", "2");
        //判断两个数据是否相等，如果内容相同， 顺序相同 则返回 true
//        ArrayUtils.isEquals(arr1,arr2);
        //判断数组中是否包含某一对象
        ArrayUtils.contains(array, "33");
        //二维数组转换成MAP
        Map map = ArrayUtils.toMap(new String[][] {
                { "RED", "#FF0000" }, { "GREEN", "#00FF00" }, { "BLUE", "#0000FF" } });
    }
}
