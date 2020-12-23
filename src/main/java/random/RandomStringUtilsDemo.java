package random;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @program:
 * @description: RandomStringUtils Demo
 * @author: dingwen
 * @create: 2020/12/22 17:42
 **/
public class RandomStringUtilsDemo {
    public static void main(String[] args) {
        //随机生成N为数字
        System.out.println(RandomStringUtils.randomNumeric(5));
        System.out.println(RandomStringUtils.random(5,true,false));
        System.out.println(RandomStringUtils.random(5,true,false));
        System.out.println(RandomStringUtils.random(5,"ddd"));
    }
}
